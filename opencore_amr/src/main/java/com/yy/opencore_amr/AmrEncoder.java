package com.yy.opencore_amr;

/**
 * Created by YaoYuan on 2018/1/9.
 */

public class AmrEncoder {

    static {
        System.loadLibrary("opencore_amr");
    }
    public static native void exit();
}
