package typings
package numjsLib.numjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abs[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def add[T](a: numjsLib.numjsMod.NjParam[T], b: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def arange[T](start: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double, dtype: numjsLib.numjsMod.NdType[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double, step: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def arange[T](start: scala.Double, stop: scala.Double, step: scala.Double, dtype: numjsLib.numjsMod.NdType[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def arange[T](stop: scala.Double, dtype: numjsLib.numjsMod.NdType[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def arccos[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def arcsin[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def arctan[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def array[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def array[T](arr: numjsLib.numjsMod.NjArray[T], dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType): numjsLib.numjsMod.NdArray[T] = js.native
  def broadcast[T, U](shape1: js.Array[T], shape2: js.Array[U]): js.Array[T | U] = js.native
  def clip[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def clip[T](x: numjsLib.numjsMod.NjParam[T], min: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def clip[T](x: numjsLib.numjsMod.NjParam[T], min: scala.Double, max: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def concatenate[T](arrays: numjsLib.numjsMod.NjArray[T]*): numjsLib.numjsMod.NdArray[T] = js.native
  def convolve[T](a: numjsLib.numjsMod.NjArray[T], b: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def cos[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def diag[T](x: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def divide[T](a: numjsLib.numjsMod.NjArray[T], b: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def dot[T](a: numjsLib.numjsMod.NjArray[T], b: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def empty[T](shape: numjsLib.numjsMod.NdArrayData[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def empty[T](shape: numjsLib.numjsMod.NdArrayData[T], dtype: numjsLib.numjsMod.NdType[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def empty[T](shape: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def empty[T](shape: scala.Double, dtype: numjsLib.numjsMod.NdType[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def equal[T](a: numjsLib.numjsMod.NjArray[T], b: numjsLib.numjsMod.NjArray[T]): scala.Boolean = js.native
  def exp[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def fft[T](x: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def fftconvolve[T](a: numjsLib.numjsMod.NjArray[T], b: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def flatten[T](array: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def float32[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Float32Array] = js.native
  def float64[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Float64Array] = js.native
  def getRawData[T](array: numjsLib.numjsMod.NdArrayData[T]): stdLib.Uint8Array = js.native
  def identity[T](n: T): numjsLib.numjsMod.NdArray[T] = js.native
  def identity[T](n: T, dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType): numjsLib.numjsMod.NdArray[T] = js.native
  def ifft[T](x: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def int16[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Int16Array] = js.native
  def int32[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Int32Array] = js.native
  def int8[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Int8Array] = js.native
  def max[T](x: numjsLib.numjsMod.NjParam[T]): T = js.native
  def mean[T](x: numjsLib.numjsMod.NjParam[T]): T = js.native
  def min[T](x: numjsLib.numjsMod.NjParam[T]): T = js.native
  def multiply[T](a: numjsLib.numjsMod.NjArray[T], b: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def negative[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def ones[T](shape: numjsLib.numjsMod.NdArrayData[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def ones[T](shape: numjsLib.numjsMod.NdArrayData[T], dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType): numjsLib.numjsMod.NdArray[T] = js.native
  def ones[T](shape: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def ones[T](shape: scala.Double, dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType): numjsLib.numjsMod.NdArray[T] = js.native
  def power[T](x1: numjsLib.numjsMod.NjParam[T], x2: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def random[T](): numjsLib.numjsMod.NdArray[T] = js.native
  def random[T](shape: numjsLib.numjsMod.NdArrayData[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def random[T](shape: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def reshape[T](array: numjsLib.numjsMod.NjArray[T], shape: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def round[T](x: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def setRawData[T](array: numjsLib.numjsMod.NdArrayData[T], data: numjsLib.numjsMod.NdArrayData[T]): stdLib.Uint8Array = js.native
  def sigmoid[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def sigmoid[T](x: numjsLib.numjsMod.NjParam[T], t: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def sin[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def softmax[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def sqrt[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def stack[T](arrays: js.Array[numjsLib.numjsMod.NdArray[T]]): numjsLib.numjsMod.NdArray[T] = js.native
  def stack[T](arrays: js.Array[numjsLib.numjsMod.NdArray[T]], axis: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def std[T](x: numjsLib.numjsMod.NjParam[T]): T = js.native
  def subtract[T](a: numjsLib.numjsMod.NjParam[T], b: numjsLib.numjsMod.NjParam[T]): T = js.native
  def sum[T](x: numjsLib.numjsMod.NjParam[T]): T = js.native
  def tan[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def tanh[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def transpose[T](x: numjsLib.numjsMod.NjParam[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def transpose[T](x: numjsLib.numjsMod.NjParam[T], axes: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def uint16[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Uint16Array] = js.native
  def uint32[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Uint32Array] = js.native
  def uint8[T](arr: numjsLib.numjsMod.NjArray[T]): numjsLib.numjsMod.NjArray[stdLib.Uint8Array] = js.native
  def zeros[T](shape: numjsLib.numjsMod.NdArrayData[T]): numjsLib.numjsMod.NdArray[T] = js.native
  def zeros[T](shape: numjsLib.numjsMod.NdArrayData[T], dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType): numjsLib.numjsMod.NdArray[T] = js.native
  def zeros[T](shape: scala.Double): numjsLib.numjsMod.NdArray[T] = js.native
  def zeros[T](shape: scala.Double, dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType): numjsLib.numjsMod.NdArray[T] = js.native
}

