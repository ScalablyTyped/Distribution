package typings.numjs

import typings.ndarray.mod.Data
import typings.ndarray.mod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("numjs", JSImport.Namespace)
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
    
    @JSImport("numjs", "errors")
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
    
    @JSImport("numjs", "images")
    @js.native
    val ^ : js.Any = js.native
    
    inline def areaSum[T](h0: Double, w0: Double, H: Double, W: Double, SAT: NdArray[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("areaSum")(h0.asInstanceOf[js.Any], w0.asInstanceOf[js.Any], H.asInstanceOf[js.Any], W.asInstanceOf[js.Any], SAT.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def areaValue[T](img: NdArray[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("areaValue")(img.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    object data {
      
      /**  28x28 grayscale image with an handwritten digit extracted from MNIST database */
      @JSImport("numjs", "images.data.digit")
      @js.native
      val digit: NdArray[Double] = js.native
      
      /** 28x28 grayscale image with an handwritten digit extracted from MNIST database */
      @JSImport("numjs", "images.data.five")
      @js.native
      val five: NdArray[Double] = js.native
      
      /**
        * The standard, yet sometimes controversial
        * Lena test image was scanned from the November 1972 edition of
        * Playboy magazine. From an image processing perspective, this image
        * is useful because it contains smooth, textured, shaded as well as
        * detail areas.
        */
      @JSImport("numjs", "images.data.lena")
      @js.native
      val lena: NdArray[Double] = js.native
      
      /**
        * The standard, yet sometimes
        * controversial Lena test image was scanned from the November 1972
        * edition of Playboy magazine. From an image processing perspective,
        * this image is useful because it contains smooth, textured, shaded as
        * well as detail areas.
        */
      @JSImport("numjs", "images.data.lenna")
      @js.native
      val lenna: NdArray[Double] = js.native
      
      /**
        * This low-contrast image of the surface of
        * the moon is useful for illustrating histogram equalization and
        * contrast stretching.
        */
      @JSImport("numjs", "images.data.moon")
      @js.native
      val moon: NdArray[Double] = js.native
      
      /** 300x600 COLOR image representing Node.js's logo */
      @JSImport("numjs", "images.data.node")
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
  
  @js.native
  trait NdArray[T]
    extends StObject
       with typings.ndarray.mod.NdArray[Data[T]] {
    
    /**
      * Add `x` to the array, element-wise.
      */
    def add(x: NjParam[T]): NdArray[T] = js.native
    def add(x: NjParam[T], copy: Boolean): NdArray[T] = js.native
    
    /**
      * Assign `x` to the array, element-wise.
      */
    def assign(x: NjParam[T]): NdArray[T] = js.native
    def assign(x: NjParam[T], copy: Boolean): NdArray[T] = js.native
    
    /**
      * Returns the discrete, linear convolution of the array using the given filter.
      *
      * @note: Arrays must have the same dimensions and `filter` must be smaller than the array.
      * @note: The convolution product is only given for points where the signals overlap completely. Values outside the signal boundary have no effect. This behaviour is known as the 'valid' mode.
      * @note: Use optimized code for 3x3, 3x3x1, 5x5, 5x5x1 filters, FFT otherwise.
      */
    def convolve(filter: NjArray[T]): NdArray[T] = js.native
    
    def diag(): NdArray[T] = js.native
    
    /**
      * Divide array by `x`, element-wise.
      */
    def divide(x: NjParam[T]): NdArray[T] = js.native
    def divide(x: NjParam[T], copy: Boolean): NdArray[T] = js.native
    
    /**
      * Dot product of two arrays.
      */
    def dot(x: NjArray[T]): NdArray[T] = js.native
    
    /**
      * Return true if two arrays have the same shape and elements, false otherwise.
      */
    def equal[U](array: NjArray[U]): Boolean = js.native
    
    /**
      * Calculate the exponential of all elements in the array, element-wise.
      *
      * @param [copy=true] - set to false to modify the array rather than create a new one
      */
    def exp(): NdArray[T] = js.native
    def exp(copy: Boolean): NdArray[T] = js.native
    
    def fftconvolve(filter: NjArray[T]): NdArray[T] = js.native
    
    /**
      * Return a copy of the array collapsed into one dimension using row-major order (C-style)
      */
    def flatten[P](): NdArray[P] = js.native
    
    /**
      * Stringify the array to make it readable in the console, by a human.
      */
    def inspect(): String = js.native
    
    def iteraxis(axis: Double, cb: js.Function2[/* x */ NdArray[T], /* i */ Double, Any]): Unit = js.native
    
    /**
      * Return the maximum value of the array
      */
    def max(): T = js.native
    
    /**
      * Return the arithmetic mean of array elements.
      */
    def mean(): T = js.native
    
    /**
      * Return the minimum value of the array
      */
    def min(): T = js.native
    
    /**
      * Multiply array by `x`, element-wise.
      */
    def multiply(x: NjParam[T]): NdArray[T] = js.native
    def multiply(x: NjParam[T], copy: Boolean): NdArray[T] = js.native
    
    var ndim: Double = js.native
    
    /**
      * Return the inverse of the array, element-wise.
      */
    def negative(): NdArray[T] = js.native
    
    /**
      * Raise array elements to powers from given array, element-wise.
      *
      * @param [copy=true] - set to false to modify the array rather than create a new one
      */
    def pow(x: NjParam[T]): NdArray[T] = js.native
    def pow(x: NjParam[T], copy: Boolean): NdArray[T] = js.native
    
    /**
      * Gives a new shape to an array without changing its data.
      *
      * @param shape The new shape should be compatible with the original shape. If an integer, then the result will be a 1-D array of that length
      */
    def reshape[T](shape: Double*): NdArray[T] = js.native
    
    /**
      * Round array to the to the nearest integer.
      */
    def round(): NdArray[T] = js.native
    def round(copy: Boolean): NdArray[T] = js.native
    
    def slice(args: (Double | (js.Array[Double | Null]) | Null)*): NdArray[T] = js.native
    
    /**
      * Calculate the positive square-root of all elements in the array, element-wise.
      *
      * @param [copy=true] - set to false to modify the array rather than create a new one
      */
    def sqrt(): NdArray[T] = js.native
    def sqrt(copy: Boolean): NdArray[T] = js.native
    
    /**
      * Returns the standard deviation, a measure of the spread of a distribution, of the array elements.
      */
    def std(): Double = js.native
    
    /**
      * Subtract `x` to the array, element-wise.
      */
    def subtract(x: NjParam[T]): NdArray[T] = js.native
    def subtract(x: NjParam[T], copy: Boolean): NdArray[T] = js.native
    
    /**
      * Sum of array elements.
      */
    def sum(): T = js.native
    
    /**
      * Stringify object to JSON
      */
    def toJSON(): Any = js.native
    
    /**
      * Converts {NdArray} to a native JavaScript {Array}
      */
    def tolist[LT](): js.Array[LT] = js.native
    
    /**
      * Permute the dimensions of the array.
      */
    def transpose(): NdArray[T] = js.native
    def transpose(args: js.Array[Double]): NdArray[T] = js.native
  }
  
  type NdArrayData[T] = Data[T]
  
  type NdType[T] = DataType[Data[Any]] | Data[T]
  
  type NjArray[T] = NdArrayData[T] | NdArray[T]
  
  type NjParam[T] = NjArray[T] | Double
}
