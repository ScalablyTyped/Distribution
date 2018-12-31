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

