package typings.ndarray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndarray", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](data: Data[T]): ndarray[T] = js.native
  def apply[T](data: Data[T], shape: js.Array[Double]): ndarray[T] = js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double]): ndarray[T] = js.native
  def apply[T](data: Data[T], shape: js.Array[Double], stride: js.Array[Double], offset: Double): ndarray[T] = js.native
}

