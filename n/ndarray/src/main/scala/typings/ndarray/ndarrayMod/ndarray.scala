package typings.ndarray.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ndarray[T] extends js.Object {
  var T: typings.ndarray.ndarrayMod.ndarray[T]
  var data: Data[T]
  var dimension: Double
  var dtype: DataType
  var offset: Double
  var order: js.Array[Double]
  var shape: js.Array[Double]
  var size: Double
  var stride: js.Array[Double]
  def get(args: Double*): T
  def hi(args: Double*): typings.ndarray.ndarrayMod.ndarray[T]
  def index(args: Double*): T
  def lo(args: Double*): typings.ndarray.ndarrayMod.ndarray[T]
  def pick(args: (Double | Null)*): typings.ndarray.ndarrayMod.ndarray[T]
  def reshape(shapes: Double*): typings.ndarray.ndarrayMod.ndarray[T]
  def set(args: Double*): T
  def step(args: Double*): typings.ndarray.ndarrayMod.ndarray[T]
  def transpose(args: Double*): typings.ndarray.ndarrayMod.ndarray[T]
}

object ndarray {
  @scala.inline
  def apply[T](
    T: typings.ndarray.ndarrayMod.ndarray[T],
    data: Data[T],
    dimension: Double,
    dtype: DataType,
    get: /* repeated */ Double => T,
    hi: /* repeated */ Double => typings.ndarray.ndarrayMod.ndarray[T],
    index: /* repeated */ Double => T,
    lo: /* repeated */ Double => typings.ndarray.ndarrayMod.ndarray[T],
    offset: Double,
    order: js.Array[Double],
    pick: /* repeated */ Double | Null => typings.ndarray.ndarrayMod.ndarray[T],
    reshape: /* repeated */ Double => typings.ndarray.ndarrayMod.ndarray[T],
    set: /* repeated */ Double => T,
    shape: js.Array[Double],
    size: Double,
    step: /* repeated */ Double => typings.ndarray.ndarrayMod.ndarray[T],
    stride: js.Array[Double],
    transpose: /* repeated */ Double => typings.ndarray.ndarrayMod.ndarray[T]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T, data = data.asInstanceOf[js.Any], dimension = dimension, dtype = dtype, get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset, order = order, pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape, size = size, step = js.Any.fromFunction1(step), stride = stride, transpose = js.Any.fromFunction1(transpose))
  
    __obj.asInstanceOf[ndarray[T]]
  }
}

