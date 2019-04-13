package typings
package numjsLib.numjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abs[T](x: NjParam[T]): NdArray[T] = js.native
  def add[T](a: NjParam[T], b: NjParam[T]): NdArray[T] = js.native
  def arange[T](start: scala.Double): NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double): NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double, dtype: NdType[T]): NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double, step: scala.Double): NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double, step: scala.Double, dtype: NdType[T]): NdArray[T] = js.native
  def arange[T](stop: scala.Double, dtype: NdType[T]): NdArray[T] = js.native
  def arccos[T](x: NjParam[T]): NdArray[T] = js.native
  def arcsin[T](x: NjParam[T]): NdArray[T] = js.native
  def arctan[T](x: NjParam[T]): NdArray[T] = js.native
  def array[T](arr: NjArray[T]): NdArray[T] = js.native
  def array[T](arr: NjArray[T], dtype: ndarrayLib.ndarrayMod.DataType): NdArray[T] = js.native
  def broadcast[T, U](shape1: js.Array[T], shape2: js.Array[U]): js.Array[T | U] = js.native
  def clip[T](x: NjParam[T]): NdArray[T] = js.native
  def clip[T](x: NjParam[T], min: scala.Double): NdArray[T] = js.native
  def clip[T](x: NjParam[T], min: scala.Double, max: scala.Double): NdArray[T] = js.native
  def concatenate[T](arrays: NjArray[T]*): NdArray[T] = js.native
  def convolve[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = js.native
  def cos[T](x: NjParam[T]): NdArray[T] = js.native
  def diag[T](x: NjArray[T]): NdArray[T] = js.native
  def divide[T](a: NjArray[T], b: NjParam[T]): NdArray[T] = js.native
  def dot[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = js.native
  def empty[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def empty[T](shape: NdArrayData[T], dtype: NdType[T]): NdArray[T] = js.native
  def empty[T](shape: scala.Double): NdArray[T] = js.native
  def empty[T](shape: scala.Double, dtype: NdType[T]): NdArray[T] = js.native
  def equal[T](a: NjArray[T], b: NjArray[T]): scala.Boolean = js.native
  def exp[T](x: NjParam[T]): NdArray[T] = js.native
  def fft[T](x: NjArray[T]): NdArray[T] = js.native
  def fftconvolve[T](a: NjArray[T], b: NjArray[T]): NdArray[T] = js.native
  def flatten[T](array: NjArray[T]): NdArray[T] = js.native
  def float32[T](arr: NjArray[T]): NjArray[stdLib.Float32Array] = js.native
  def float64[T](arr: NjArray[T]): NjArray[stdLib.Float64Array] = js.native
  def getRawData[T](array: NdArrayData[T]): stdLib.Uint8Array = js.native
  def identity[T](n: T): NdArray[T] = js.native
  def identity[T](n: T, dtype: ndarrayLib.ndarrayMod.DataType): NdArray[T] = js.native
  def ifft[T](x: NjArray[T]): NdArray[T] = js.native
  def int16[T](arr: NjArray[T]): NjArray[stdLib.Int16Array] = js.native
  def int32[T](arr: NjArray[T]): NjArray[stdLib.Int32Array] = js.native
  def int8[T](arr: NjArray[T]): NjArray[stdLib.Int8Array] = js.native
  def max[T](x: NjParam[T]): T = js.native
  def mean[T](x: NjParam[T]): T = js.native
  def min[T](x: NjParam[T]): T = js.native
  def multiply[T](a: NjArray[T], b: NjParam[T]): NdArray[T] = js.native
  def negative[T](x: NjParam[T]): NdArray[T] = js.native
  def ones[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def ones[T](shape: NdArrayData[T], dtype: ndarrayLib.ndarrayMod.DataType): NdArray[T] = js.native
  def ones[T](shape: scala.Double): NdArray[T] = js.native
  def ones[T](shape: scala.Double, dtype: ndarrayLib.ndarrayMod.DataType): NdArray[T] = js.native
  def power[T](x1: NjParam[T], x2: NjParam[T]): NdArray[T] = js.native
  def random[T](): NdArray[T] = js.native
  def random[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def random[T](shape: scala.Double): NdArray[T] = js.native
  def reshape[T](array: NjArray[T], shape: NdArray[T]): NdArray[T] = js.native
  def round[T](x: NjArray[T]): NdArray[T] = js.native
  def setRawData[T](array: NdArrayData[T], data: NdArrayData[T]): stdLib.Uint8Array = js.native
  def sigmoid[T](x: NjParam[T]): NdArray[T] = js.native
  def sigmoid[T](x: NjParam[T], t: scala.Double): NdArray[T] = js.native
  def sin[T](x: NjParam[T]): NdArray[T] = js.native
  def softmax[T](x: NjParam[T]): NdArray[T] = js.native
  def sqrt[T](x: NjParam[T]): NdArray[T] = js.native
  def stack[T](arrays: js.Array[NdArray[T]]): NdArray[T] = js.native
  def stack[T](arrays: js.Array[NdArray[T]], axis: scala.Double): NdArray[T] = js.native
  def std[T](x: NjParam[T]): T = js.native
  def subtract[T](a: NjParam[T], b: NjParam[T]): T = js.native
  def sum[T](x: NjParam[T]): T = js.native
  def tan[T](x: NjParam[T]): NdArray[T] = js.native
  def tanh[T](x: NjParam[T]): NdArray[T] = js.native
  def transpose[T](x: NjParam[T]): NdArray[T] = js.native
  def transpose[T](x: NjParam[T], axes: scala.Double): NdArray[T] = js.native
  def uint16[T](arr: NjArray[T]): NjArray[stdLib.Uint16Array] = js.native
  def uint32[T](arr: NjArray[T]): NjArray[stdLib.Uint32Array] = js.native
  def uint8[T](arr: NjArray[T]): NjArray[stdLib.Uint8Array] = js.native
  def zeros[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def zeros[T](shape: NdArrayData[T], dtype: ndarrayLib.ndarrayMod.DataType): NdArray[T] = js.native
  def zeros[T](shape: scala.Double): NdArray[T] = js.native
  def zeros[T](shape: scala.Double, dtype: ndarrayLib.ndarrayMod.DataType): NdArray[T] = js.native
}

