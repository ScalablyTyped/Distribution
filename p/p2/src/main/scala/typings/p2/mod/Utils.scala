package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Utils")
@js.native
class Utils () extends js.Object

/* static members */
@JSImport("p2", "Utils")
@js.native
object Utils extends js.Object {
  def appendArray[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  def arrayRemove[T](array: js.Array[T], element: Double): Unit = js.native
  def defaults(options: js.Any, defaults: js.Any): js.Any = js.native
  def extend(a: js.Any, b: js.Any): Unit = js.native
  def shallowClone[T](obj: T): T = js.native
  def splice[T](array: js.Array[T], index: Double, howMany: Double): Unit = js.native
}

