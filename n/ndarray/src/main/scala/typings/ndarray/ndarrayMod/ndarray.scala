package typings.ndarray.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ndarray[T] extends js.Object {
  var T: ndarray[T]
  var data: Data[T]
  var dimension: Double
  var dtype: DataType
  var offset: Double
  var order: js.Array[Double]
  var shape: js.Array[Double]
  var size: Double
  var stride: js.Array[Double]
  def get(args: Double*): T
  def hi(args: Double*): ndarray[T]
  def index(args: Double*): T
  def lo(args: Double*): ndarray[T]
  def pick(args: (Double | Null)*): ndarray[T]
  def reshape(shapes: Double*): ndarray[T]
  def set(args: Double*): T
  def step(args: Double*): ndarray[T]
  def transpose(args: Double*): ndarray[T]
}

object ndarray {
  @scala.inline
  def apply[T](
    T: ndarray[T],
    data: Data[T],
    dimension: Double,
    dtype: DataType,
    get: /* repeated */ Double => T,
    hi: /* repeated */ Double => ndarray[T],
    index: /* repeated */ Double => T,
    lo: /* repeated */ Double => ndarray[T],
    offset: Double,
    order: js.Array[Double],
    pick: /* repeated */ Double | Null => ndarray[T],
    reshape: /* repeated */ Double => ndarray[T],
    set: /* repeated */ Double => T,
    shape: js.Array[Double],
    size: Double,
    step: /* repeated */ Double => ndarray[T],
    stride: js.Array[Double],
    transpose: /* repeated */ Double => ndarray[T]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), hi = js.Any.fromFunction1(hi), index = js.Any.fromFunction1(index), lo = js.Any.fromFunction1(lo), offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pick = js.Any.fromFunction1(pick), reshape = js.Any.fromFunction1(reshape), set = js.Any.fromFunction1(set), shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = js.Any.fromFunction1(step), stride = stride.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
  
    __obj.asInstanceOf[ndarray[T]]
  }
}

