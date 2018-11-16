package typings
package mendixmodelsdkLib.distSdkInternalInstancesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IList[T]
  extends stdLib.Array[T] {
  def clear(): js.Array[T] = js.native
  def find(
    predicate: js.Function3[/* item */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
    thisArg: js.Any,
    fromIndex: scala.Double
  ): js.UndefOr[T] = js.native
  def remove(value: T): scala.Boolean = js.native
  def replace(newItems: js.Array[T]): js.Array[T] = js.native
}

