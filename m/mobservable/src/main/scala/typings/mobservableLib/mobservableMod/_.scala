package typings
package mobservableLib.mobservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "_")
@js.native
object `_` extends js.Object {
  def isComputingView(): scala.Boolean = js.native
  def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
}

