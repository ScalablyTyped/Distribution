package typings.numjs

import typings.ndarray.mod.Data
import typings.ndarray.mod.DataType
import typings.numjs.mod.NdArray
import typings.numjs.mod.NdArrayData
import typings.numjs.mod.NdType
import typings.numjs.mod.NjArray
import typings.numjs.mod.NjParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object nj {
    
    @JSGlobal("nj")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abs[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def add[T](a: NjParam[T], b: NjParam[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def arange[T](start: Double): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arange")(start.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def arange[T](start: Double, stop: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arange")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def arange[T](start: Double, stop: Double, dtype: NdType[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arange")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def arange[T](start: Double, stop: Double, step: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arange")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def arange[T](start: Double, stop: Double, step: Double, dtype: NdType[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arange")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def arange[T](start: Double, stop: Unit, dtype: NdType[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arange")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def arange[T](stop: Double, dtype: NdType[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arange")(stop.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def arccos[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arccos")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def arcsin[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arcsin")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def arctan[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arctan")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def array[T](arr: NjArray[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(arr.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def array[T](arr: NjArray[T], dtype: DataType[Data[Any]]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(arr.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def broadcast[T, U](shape1: js.Array[T], shape2: js.Array[U]): js.Array[T | U] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T | U]]
    
    inline def clip[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("clip")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def clip[T](x: NjParam[T], min: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("clip")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def clip[T](x: NjParam[T], min: Double, max: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("clip")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def clip[T](x: NjParam[T], min: Unit, max: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("clip")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def concatenate[T](arrays: NjArray[T]*): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NdArray[T]]
    
    inline def convolve[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convolve")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def cos[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def diag[T](x: NjArray[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def divide[T](a: NjArray[T], b: NjParam[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def dot[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def empty[T](shape: Double): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def empty[T](shape: Double, dtype: NdType[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("empty")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def empty[T](shape: NdArrayData[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def empty[T](shape: NdArrayData[T], dtype: NdType[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("empty")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def equal[T](a: NjArray[T], b: NjArray[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    object errors {
      
      @JSGlobal("nj.errors")
      @js.native
      val ^ : js.Any = js.native
      
      inline def ConfigError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ConfigError")().asInstanceOf[js.Error]
      inline def ConfigError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ConfigError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
      
      inline def NotImplementedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("NotImplementedError")().asInstanceOf[js.Error]
      inline def NotImplementedError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("NotImplementedError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
      
      inline def ValueError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueError")().asInstanceOf[js.Error]
      inline def ValueError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    }
    
    inline def exp[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def fft[T](x: NjArray[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def fftconvolve[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fftconvolve")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def flatten[T](array: NjArray[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def float32[T](arr: NjArray[T]): NjArray[js.typedarray.Float32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("float32")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Float32Array]]
    
    inline def float64[T](arr: NjArray[T]): NjArray[js.typedarray.Float64Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("float64")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Float64Array]]
    
    inline def getRawData[T](array: NdArrayData[T]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawData")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def identity[T](n: T): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(n.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def identity[T](n: T, dtype: DataType[Data[Any]]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("identity")(n.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def ifft[T](x: NjArray[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    object images {
      
      @JSGlobal("nj.images")
      @js.native
      val ^ : js.Any = js.native
      
      inline def areaSum[T](h0: Double, w0: Double, H: Double, W: Double, SAT: NdArray[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("areaSum")(h0.asInstanceOf[js.Any], w0.asInstanceOf[js.Any], H.asInstanceOf[js.Any], W.asInstanceOf[js.Any], SAT.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def areaValue[T](img: NdArray[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("areaValue")(img.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      object data {
        
        /**  28x28 grayscale image with an handwritten digit extracted from MNIST database */
        @JSGlobal("nj.images.data.digit")
        @js.native
        val digit: NdArray[Double] = js.native
        
        /** 28x28 grayscale image with an handwritten digit extracted from MNIST database */
        @JSGlobal("nj.images.data.five")
        @js.native
        val five: NdArray[Double] = js.native
        
        /**
          * The standard, yet sometimes controversial
          * Lena test image was scanned from the November 1972 edition of
          * Playboy magazine. From an image processing perspective, this image
          * is useful because it contains smooth, textured, shaded as well as
          * detail areas.
          */
        @JSGlobal("nj.images.data.lena")
        @js.native
        val lena: NdArray[Double] = js.native
        
        /**
          * The standard, yet sometimes
          * controversial Lena test image was scanned from the November 1972
          * edition of Playboy magazine. From an image processing perspective,
          * this image is useful because it contains smooth, textured, shaded as
          * well as detail areas.
          */
        @JSGlobal("nj.images.data.lenna")
        @js.native
        val lenna: NdArray[Double] = js.native
        
        /**
          * This low-contrast image of the surface of
          * the moon is useful for illustrating histogram equalization and
          * contrast stretching.
          */
        @JSGlobal("nj.images.data.moon")
        @js.native
        val moon: NdArray[Double] = js.native
        
        /** 300x600 COLOR image representing Node.js's logo */
        @JSGlobal("nj.images.data.node")
        @js.native
        val node: NdArray[Double] = js.native
      }
      
      inline def flip[T, O](img: NdArray[T]): NdArray[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(img.asInstanceOf[js.Any]).asInstanceOf[NdArray[O]]
      
      inline def read(input: String): NdArray[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any]).asInstanceOf[NdArray[js.typedarray.Uint8Array]]
      
      inline def resize[T](img: NdArray[T], height: Double, width: Double): NdArray[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(img.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[NdArray[js.typedarray.Uint8Array]]
      
      inline def rgb2gray[T](img: NdArray[T]): NdArray[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2gray")(img.asInstanceOf[js.Any]).asInstanceOf[NdArray[js.typedarray.Uint8Array]]
      
      inline def sat[T](img: NdArray[T]): NdArray[js.typedarray.Uint32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("sat")(img.asInstanceOf[js.Any]).asInstanceOf[NdArray[js.typedarray.Uint32Array]]
      
      inline def save[T](img: NdArray[T], dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(img.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def scharr[T](img: NdArray[T]): NdArray[js.typedarray.Float32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("scharr")(img.asInstanceOf[js.Any]).asInstanceOf[NdArray[js.typedarray.Float32Array]]
      
      inline def sobel[T](img: NdArray[T]): NdArray[js.typedarray.Float32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("sobel")(img.asInstanceOf[js.Any]).asInstanceOf[NdArray[js.typedarray.Float32Array]]
      
      inline def ssat[T](img: NdArray[T]): NdArray[js.typedarray.Uint32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("ssat")(img.asInstanceOf[js.Any]).asInstanceOf[NdArray[js.typedarray.Uint32Array]]
    }
    
    inline def int16[T](arr: NjArray[T]): NjArray[js.typedarray.Int16Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("int16")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Int16Array]]
    
    inline def int32[T](arr: NjArray[T]): NjArray[js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Int32Array]]
    
    inline def int8[T](arr: NjArray[T]): NjArray[js.typedarray.Int8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("int8")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Int8Array]]
    
    inline def max[T](x: NjParam[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def mean[T](x: NjParam[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def min[T](x: NjParam[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def mod[T](x: NjParam[T]): js.Array[NdArray[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[NdArray[Double]]]
    inline def mod[T](x: NjParam[T], copy: Boolean): js.Array[NdArray[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[js.Array[NdArray[Double]]]
    
    inline def multiply[T](a: NjArray[T], b: NjParam[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def negative[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("negative")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def ones[T](shape: Double): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def ones[T](shape: Double, dtype: DataType[Data[Any]]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def ones[T](shape: NdArrayData[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def ones[T](shape: NdArrayData[T], dtype: DataType[Data[Any]]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def power[T](x1: NjParam[T], x2: NjParam[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("power")(x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def random[T](): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[NdArray[T]]
    inline def random[T](shape: Double): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def random[T](shape: NdArrayData[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def reshape[T](array: NjArray[T], shape: NdArray[T]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(array.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def round[T](x: NjArray[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def setRawData[T](array: NdArrayData[T], data: NdArrayData[T]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("setRawData")(array.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def sigmoid[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sigmoid")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def sigmoid[T](x: NjParam[T], t: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoid")(x.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def sin[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def softmax[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def sqrt[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def stack[T](arrays: js.Array[NdArray[T]]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")(arrays.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def stack[T](arrays: js.Array[NdArray[T]], axis: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(arrays.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def std[T](x: NjParam[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("std")(x.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def subtract[T](a: NjParam[T], b: NjParam[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def sum[T](x: NjParam[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def tan[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def tanh[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    
    inline def transpose[T](x: NjParam[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def transpose[T](x: NjParam[T], axes: Double): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    
    inline def uint16[T](arr: NjArray[T]): NjArray[js.typedarray.Uint16Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("uint16")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Uint16Array]]
    
    inline def uint32[T](arr: NjArray[T]): NjArray[js.typedarray.Uint32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("uint32")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Uint32Array]]
    
    inline def uint8[T](arr: NjArray[T]): NjArray[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8")(arr.asInstanceOf[js.Any]).asInstanceOf[NjArray[js.typedarray.Uint8Array]]
    
    inline def zeros[T](shape: Double): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def zeros[T](shape: Double, dtype: DataType[Data[Any]]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
    inline def zeros[T](shape: NdArrayData[T]): NdArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[T]]
    inline def zeros[T](shape: NdArrayData[T], dtype: DataType[Data[Any]]): NdArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[T]]
  }
}
