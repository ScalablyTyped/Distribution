package typings
package ndarrayLib.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ndarray[T] extends js.Object {
  var T: ndarray[T]
  var data: ndarrayLib.ndarrayMod.ndarrayNs.Data[T]
  var dimension: scala.Double
  var dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType
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
    data: ndarrayLib.ndarrayMod.ndarrayNs.Data[T],
    dimension: scala.Double,
    dtype: ndarrayLib.ndarrayMod.ndarrayNs.DataType,
    get: js.Function1[/* repeated */ scala.Double, T],
    hi: js.Function1[/* repeated */ scala.Double, ndarray[T]],
    index: js.Function1[/* repeated */ scala.Double, T],
    lo: js.Function1[/* repeated */ scala.Double, ndarray[T]],
    offset: scala.Double,
    order: js.Array[scala.Double],
    pick: js.Function1[/* repeated */ scala.Double | scala.Null, ndarray[T]],
    reshape: js.Function1[/* repeated */ scala.Double, ndarray[T]],
    set: js.Function1[/* repeated */ scala.Double, T],
    shape: js.Array[scala.Double],
    size: scala.Double,
    step: js.Function1[/* repeated */ scala.Double, ndarray[T]],
    stride: js.Array[scala.Double],
    transpose: js.Function1[/* repeated */ scala.Double, ndarray[T]]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T, data = data.asInstanceOf[js.Any], dimension = dimension, dtype = dtype, get = get, hi = hi, index = index, lo = lo, offset = offset, order = order, pick = pick, reshape = reshape, set = set, shape = shape, size = size, step = step, stride = stride, transpose = transpose)
  
    __obj.asInstanceOf[ndarray[T]]
  }
}

