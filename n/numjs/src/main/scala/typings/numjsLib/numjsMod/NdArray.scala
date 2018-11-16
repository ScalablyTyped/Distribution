package typings
package numjsLib.numjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NdArray[T]
  extends ndarrayLib.ndarrayMod.ndarray[T] {
  @JSName("T")
  var T_NdArray: NdArray[T] = js.native
  var ndim: scala.Double = js.native
  /**
  	 * Add `x` to the array, element-wise.
  	 */
  def add(x: NjParam[T]): NdArray[T] = js.native
  /**
  	 * Add `x` to the array, element-wise.
  	 */
  def add(x: NjParam[T], copy: scala.Boolean): NdArray[T] = js.native
  /**
  	 * Assign `x` to the array, element-wise.
  	 */
  def assign(x: NjParam[T]): NdArray[T] = js.native
  /**
  	 * Assign `x` to the array, element-wise.
  	 */
  def assign(x: NjParam[T], copy: scala.Boolean): NdArray[T] = js.native
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
  /**
  	 * Divide array by `x`, element-wise.
  	 */
  def divide(x: NjParam[T], copy: scala.Boolean): NdArray[T] = js.native
  /**
  	 * Dot product of two arrays.
  	 */
  def dot(x: NjArray[T]): NdArray[T] = js.native
  /**
  	 * Return true if two arrays have the same shape and elements, false otherwise.
  	 */
  def equal[U](array: NjArray[U]): scala.Boolean = js.native
  /**
  	 * Calculate the exponential of all elements in the array, element-wise.
  	 *
  	 * @param [copy=true] - set to false to modify the array rather than create a new one
  	 */
  def exp(): NdArray[T] = js.native
  /**
  	 * Calculate the exponential of all elements in the array, element-wise.
  	 *
  	 * @param [copy=true] - set to false to modify the array rather than create a new one
  	 */
  def exp(copy: scala.Boolean): NdArray[T] = js.native
  def fftconvolve(filter: NjArray[T]): NdArray[T] = js.native
  /**
  	 * Return a copy of the array collapsed into one dimension using row-major order (C-style)
  	 */
  def flatten[P](): NdArray[P] = js.native
  /**
  	 * Stringify the array to make it readable in the console, by a human.
  	 */
  def inspect(): java.lang.String = js.native
  def iteraxis(axis: scala.Double, cb: js.Function2[/* x */ NdArray[T], /* i */ scala.Double, _]): scala.Unit = js.native
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
  /**
  	 * Multiply array by `x`, element-wise.
  	 */
  def multiply(x: NjParam[T], copy: scala.Boolean): NdArray[T] = js.native
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
  /**
  	 * Raise array elements to powers from given array, element-wise.
  	 *
  	 * @param [copy=true] - set to false to modify the array rather than create a new one
  	 */
  def pow(x: NjParam[T], copy: scala.Boolean): NdArray[T] = js.native
  /**
  	 * Round array to the to the nearest integer.
  	 */
  def round(): NdArray[T] = js.native
  /**
  	 * Round array to the to the nearest integer.
  	 */
  def round(copy: scala.Boolean): NdArray[T] = js.native
  def slice(args: (scala.Double | js.Array[scala.Double])*): NdArray[T] = js.native
  /**
  	 * Calculate the positive square-root of all elements in the array, element-wise.
  	 *
  	 * @param [copy=true] - set to false to modify the array rather than create a new one
  	 */
  def sqrt(): NdArray[T] = js.native
  /**
  	 * Calculate the positive square-root of all elements in the array, element-wise.
  	 *
  	 * @param [copy=true] - set to false to modify the array rather than create a new one
  	 */
  def sqrt(copy: scala.Boolean): NdArray[T] = js.native
  /**
  	 * Returns the standard deviation, a measure of the spread of a distribution, of the array elements.
  	 */
  def std(): scala.Double = js.native
  /**
  	 * Subtract `x` to the array, element-wise.
  	 */
  def subtract(x: NjParam[T]): NdArray[T] = js.native
  /**
  	 * Subtract `x` to the array, element-wise.
  	 */
  def subtract(x: NjParam[T], copy: scala.Boolean): NdArray[T] = js.native
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
  /**
  	 * Permute the dimensions of the array.
  	 */
  def transpose(args: js.Array[scala.Double]): NdArray[T] = js.native
}

