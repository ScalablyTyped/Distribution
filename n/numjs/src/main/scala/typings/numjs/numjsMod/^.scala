package typings.numjs.numjsMod

import typings.ndarray.ndarrayMod.DataType
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
object ^ extends js.Object {
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
}

