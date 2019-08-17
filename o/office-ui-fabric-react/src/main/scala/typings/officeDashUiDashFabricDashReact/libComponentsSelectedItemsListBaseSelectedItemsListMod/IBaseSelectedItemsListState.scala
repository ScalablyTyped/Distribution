package typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseSelectedItemsListState[T] extends js.Object {
  var items: js.Array[T]
}

object IBaseSelectedItemsListState {
  @scala.inline
  def apply[T](items: js.Array[T]): IBaseSelectedItemsListState[T] = {
    val __obj = js.Dynamic.literal(items = items)
  
    __obj.asInstanceOf[IBaseSelectedItemsListState[T]]
  }
}

