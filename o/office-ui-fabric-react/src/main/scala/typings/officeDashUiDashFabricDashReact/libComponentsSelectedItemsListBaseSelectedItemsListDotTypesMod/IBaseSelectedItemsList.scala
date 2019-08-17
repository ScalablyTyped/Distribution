package typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseSelectedItemsList[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.undefined
  def addItems(items: js.Array[T]): Unit
}

object IBaseSelectedItemsList {
  @scala.inline
  def apply[T](addItems: js.Array[T] => Unit, items: js.Array[T] = null): IBaseSelectedItemsList[T] = {
    val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1(addItems))
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[IBaseSelectedItemsList[T]]
  }
}

