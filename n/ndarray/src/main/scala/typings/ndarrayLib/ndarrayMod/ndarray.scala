package typings
package ndarrayLib.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ndarray[T] extends js.Object {
  var T: ndarray[T]
  var data: Data[T]
  var dimension: scala.Double
  var dtype: DataType
  var offset: scala.Double
  var order: js.Array[scala.Double]
  var shape: js.Array[scala.Double]
  var size: scala.Double
  var stride: js.Array[scala.Double]
  def get(args: scala.Double*): T
  def hi(args: scala.Double*): ndarray[T]
  def index(args: scala.Double*): T
  def lo(args: scala.Double*): ndarray[T]
  def pick(args: (scala.Double | scala.Null)*): ndarray[T]
  def reshape(shapes: scala.Double*): ndarray[T]
  def set(args: scala.Double*): T
  def step(args: scala.Double*): ndarray[T]
  def transpose(args: scala.Double*): ndarray[T]
}

object ndarray {
  @scala.inline
  def apply[T](
    T: ndarray[T],
    data: Data[T],
    dimension: scala.Double,
    dtype: DataType,
    get: /* repeated */ scala.Double => T,
    hi: /* repeated */ scala.Double => ndarray[T],
    index: /* repeated */ scala.Double => T,
    lo: /* repeated */ scala.Double => ndarray[T],
    offset: scala.Double,
    order: js.Array[scala.Double],
    pick: /* repeated */ scala.Double | scala.Null => ndarray[T],
    reshape: /* repeated */ scala.Double => ndarray[T],
    set: /* repeated */ scala.Double => T,
    shape: js.Array[scala.Double],
    size: scala.Double,
    step: /* repeated */ scala.Double => ndarray[T],
    stride: js.Array[scala.Double],
    transpose: /* repeated */ scala.Double => ndarray[T]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T, data = data.asInstanceOf[js.Any], dimension = dimension, dtype = dtype, get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset, order = order, pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape, size = size, step = js.Any.fromFunction1(step), stride = stride, transpose = js.Any.fromFunction1(transpose))
  
    __obj.asInstanceOf[ndarray[T]]
  }
}

