package typings
package ndarrayLib.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndarray", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](data: ndarrayLib.ndarrayMod.ndarrayNs.Data[T]): ndarrayLib.ndarrayMod.ndarray[T] = js.native
  def apply[T](data: ndarrayLib.ndarrayMod.ndarrayNs.Data[T], shape: js.Array[scala.Double]): ndarrayLib.ndarrayMod.ndarray[T] = js.native
  def apply[T](
    data: ndarrayLib.ndarrayMod.ndarrayNs.Data[T],
    shape: js.Array[scala.Double],
    stride: js.Array[scala.Double]
  ): ndarrayLib.ndarrayMod.ndarray[T] = js.native
  def apply[T](
    data: ndarrayLib.ndarrayMod.ndarrayNs.Data[T],
    shape: js.Array[scala.Double],
    stride: js.Array[scala.Double],
    offset: scala.Double
  ): ndarrayLib.ndarrayMod.ndarray[T] = js.native
}

