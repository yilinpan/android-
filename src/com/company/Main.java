package com.company;
public class Main {

    public static void main(String[] args) {
        int[] e = new int[20];
        int a = 1;
        int b = 1;
        int i = 2;
        e[0] = 1;
        e[1] = 1;
        while (i < 20) {
            if (a <= b) {
                a += b;
                e[i] = a;
                i++;
            }
            else  {
                b += a;
                e[i] =b;
                i++;
            }
        }
        for (int j = 19;j > -1; j--) {
            System.out.println(e[j] + " ");
        }
    }
}
