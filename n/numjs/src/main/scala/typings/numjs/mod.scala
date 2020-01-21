package typings.numjs

import typings.ndarray.mod.Data
import typings.ndarray.mod.DataType
import typings.ndarray.mod.ndarray
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait NdArray[T] extends ndarray[T] {
    @JSName("T")
    var T_NdArray: NdArray[T] = js.native
    var ndim: Double = js.native
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
    def iteraxis(axis: Double, cb: js.Function2[/* x */ NdArray[T], /* i */ Double, _]): Unit = js.native
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
    	 * Round array to the to the nearest integer.
    	 */
    def round(): NdArray[T] = js.native
    def round(copy: Boolean): NdArray[T] = js.native
    def slice(args: (Double | js.Array[Double])*): NdArray[T] = js.native
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
    def toJSON(): js.Any = js.native
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
  
  def abs[T](x: NjParam[T]): NdArray[T] = js.native
  def add[T](a: NjParam[T], b: NjParam[T]): NdArray[T] = js.native
  def arange[T](start: Double): NdArray[T] = js.native
  def arange[T](start: Double, stop: Double): NdArray[T] = js.native
  def arange[T](start: Double, stop: Double, dtype: NdType[T]): NdArray[T] = js.native
  def arange[T](start: Double, stop: Double, step: Double): NdArray[T] = js.native
  def arange[T](start: Double, stop: Double, step: Double, dtype: NdType[T]): NdArray[T] = js.native
  def arange[T](stop: Double, dtype: NdType[T]): NdArray[T] = js.native
  def arccos[T](x: NjParam[T]): NdArray[T] = js.native
  def arcsin[T](x: NjParam[T]): NdArray[T] = js.native
  def arctan[T](x: NjParam[T]): NdArray[T] = js.native
  def array[T](arr: NjArray[T]): NdArray[T] = js.native
  def array[T](arr: NjArray[T], dtype: DataType): NdArray[T] = js.native
  def broadcast[T, U](shape1: js.Array[T], shape2: js.Array[U]): js.Array[T | U] = js.native
  def clip[T](x: NjParam[T]): NdArray[T] = js.native
  def clip[T](x: NjParam[T], min: Double): NdArray[T] = js.native
  def clip[T](x: NjParam[T], min: Double, max: Double): NdArray[T] = js.native
  def concatenate[T](arrays: NjArray[T]*): NdArray[T] = js.native
  def convolve[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = js.native
  def cos[T](x: NjParam[T]): NdArray[T] = js.native
  def diag[T](x: NjArray[T]): NdArray[T] = js.native
  def divide[T](a: NjArray[T], b: NjParam[T]): NdArray[T] = js.native
  def dot[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = js.native
  def empty[T](shape: Double): NdArray[T] = js.native
  def empty[T](shape: Double, dtype: NdType[T]): NdArray[T] = js.native
  def empty[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def empty[T](shape: NdArrayData[T], dtype: NdType[T]): NdArray[T] = js.native
  def equal[T](a: NjArray[T], b: NjArray[T]): Boolean = js.native
  def exp[T](x: NjParam[T]): NdArray[T] = js.native
  def fft[T](x: NjArray[T]): NdArray[T] = js.native
  def fftconvolve[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = js.native
  def flatten[T](array: NjArray[T]): NdArray[T] = js.native
  def float32[T](arr: NjArray[T]): NjArray[Float32Array] = js.native
  def float64[T](arr: NjArray[T]): NjArray[Float64Array] = js.native
  def getRawData[T](array: NdArrayData[T]): Uint8Array = js.native
  def identity[T](n: T): NdArray[T] = js.native
  def identity[T](n: T, dtype: DataType): NdArray[T] = js.native
  def ifft[T](x: NjArray[T]): NdArray[T] = js.native
  def int16[T](arr: NjArray[T]): NjArray[Int16Array] = js.native
  def int32[T](arr: NjArray[T]): NjArray[Int32Array] = js.native
  def int8[T](arr: NjArray[T]): NjArray[Int8Array] = js.native
  def max[T](x: NjParam[T]): T = js.native
  def mean[T](x: NjParam[T]): T = js.native
  def min[T](x: NjParam[T]): T = js.native
  def multiply[T](a: NjArray[T], b: NjParam[T]): NdArray[T] = js.native
  def negative[T](x: NjParam[T]): NdArray[T] = js.native
  def ones[T](shape: Double): NdArray[T] = js.native
  def ones[T](shape: Double, dtype: DataType): NdArray[T] = js.native
  def ones[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def ones[T](shape: NdArrayData[T], dtype: DataType): NdArray[T] = js.native
  def power[T](x1: NjParam[T], x2: NjParam[T]): NdArray[T] = js.native
  def random[T](): NdArray[T] = js.native
  def random[T](shape: Double): NdArray[T] = js.native
  def random[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def reshape[T](array: NjArray[T], shape: NdArray[T]): NdArray[T] = js.native
  def round[T](x: NjArray[T]): NdArray[T] = js.native
  def setRawData[T](array: NdArrayData[T], data: NdArrayData[T]): Uint8Array = js.native
  def sigmoid[T](x: NjParam[T]): NdArray[T] = js.native
  def sigmoid[T](x: NjParam[T], t: Double): NdArray[T] = js.native
  def sin[T](x: NjParam[T]): NdArray[T] = js.native
  def softmax[T](x: NjParam[T]): NdArray[T] = js.native
  def sqrt[T](x: NjParam[T]): NdArray[T] = js.native
  def stack[T](arrays: js.Array[NdArray[T]]): NdArray[T] = js.native
  def stack[T](arrays: js.Array[NdArray[T]], axis: Double): NdArray[T] = js.native
  def std[T](x: NjParam[T]): T = js.native
  def subtract[T](a: NjParam[T], b: NjParam[T]): T = js.native
  def sum[T](x: NjParam[T]): T = js.native
  def tan[T](x: NjParam[T]): NdArray[T] = js.native
  def tanh[T](x: NjParam[T]): NdArray[T] = js.native
  def transpose[T](x: NjParam[T]): NdArray[T] = js.native
  def transpose[T](x: NjParam[T], axes: Double): NdArray[T] = js.native
  def uint16[T](arr: NjArray[T]): NjArray[Uint16Array] = js.native
  def uint32[T](arr: NjArray[T]): NjArray[Uint32Array] = js.native
  def uint8[T](arr: NjArray[T]): NjArray[Uint8Array] = js.native
  def zeros[T](shape: Double): NdArray[T] = js.native
  def zeros[T](shape: Double, dtype: DataType): NdArray[T] = js.native
  def zeros[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def zeros[T](shape: NdArrayData[T], dtype: DataType): NdArray[T] = js.native
  @js.native
  object errors extends js.Object {
    def ConfigError(): Error = js.native
    def ConfigError(message: String): Error = js.native
    def NotImplementedError(): Error = js.native
    def NotImplementedError(message: String): Error = js.native
    def ValueError(): Error = js.native
    def ValueError(message: String): Error = js.native
  }
  
  @js.native
  object images extends js.Object {
    def areaSum[T](h0: Double, w0: Double, H: Double, W: Double, SAT: NdArray[T]): Double = js.native
    def areaValue[T](img: NdArray[T]): Double = js.native
    def flip[T, O](img: NdArray[T]): NdArray[O] = js.native
    def read(input: String): NdArray[Uint8Array] = js.native
    def resize[T](img: NdArray[T], height: Double, width: Double): NdArray[Uint8Array] = js.native
    def rgb2gray[T](img: NdArray[T]): NdArray[Uint8Array] = js.native
    def sat[T](img: NdArray[T]): NdArray[Uint32Array] = js.native
    def save[T](img: NdArray[T], dest: String): Unit = js.native
    def scharr[T](img: NdArray[T]): NdArray[Float32Array] = js.native
    def sobel[T](img: NdArray[T]): NdArray[Float32Array] = js.native
    def ssat[T](img: NdArray[T]): NdArray[Uint32Array] = js.native
    @js.native
    object data extends js.Object {
      /**  28x28 grayscale image with an handwritten digit extracted from MNIST database */
      val digit: NdArray[Double] = js.native
      /** 28x28 grayscale image with an handwritten digit extracted from MNIST database */
      val five: NdArray[Double] = js.native
      /**
      		 * The standard, yet sometimes controversial
      		 * Lena test image was scanned from the November 1972 edition of
      		 * Playboy magazine. From an image processing perspective, this image
      		 * is useful because it contains smooth, textured, shaded as well as
      		 * detail areas.
      		 */
      val lena: NdArray[Double] = js.native
      /**
      		 * The standard, yet sometimes
      		 * controversial Lena test image was scanned from the November 1972
      		 * edition of Playboy magazine. From an image processing perspective,
      		 * this image is useful because it contains smooth, textured, shaded as
      		 * well as detail areas.
      		 */
      val lenna: NdArray[Double] = js.native
      /**
      		 * This low-contrast image of the surface of
      		 * the moon is useful for illustrating histogram equalization and
      		 * contrast stretching.
      		 */
      val moon: NdArray[Double] = js.native
      /** 300x600 COLOR image representing Node.js's logo */
      val node: NdArray[Double] = js.native
    }
    
  }
  
  type NdArrayData[T] = Data[T]
  type NdType[T] = DataType | Data[T]
  type NjArray[T] = NdArrayData[T] | NdArray[T]
  type NjParam[T] = NjArray[T] | Double
}

