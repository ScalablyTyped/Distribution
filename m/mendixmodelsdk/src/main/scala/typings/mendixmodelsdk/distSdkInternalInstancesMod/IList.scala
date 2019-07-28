package typings.mendixmodelsdk.distSdkInternalInstancesMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IList[T] extends Array[T] {
  def clear(): js.Array[T] = js.native
  def find(
    predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    thisArg: js.Any,
    fromIndex: Double
  ): js.UndefOr[T] = js.native
  def remove(value: T): Boolean = js.native
  def replace(newItems: js.Array[T]): js.Array[T] = js.native
}

