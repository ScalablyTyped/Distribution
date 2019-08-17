package typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseExtendedPickerState[T] extends js.Object {
  var queryString: String | Null
  var selectedItems: js.Array[T] | Null
  var suggestionItems: js.Array[T] | Null
}

object IBaseExtendedPickerState {
  @scala.inline
  def apply[T](queryString: String = null, selectedItems: js.Array[T] = null, suggestionItems: js.Array[T] = null): IBaseExtendedPickerState[T] = {
    val __obj = js.Dynamic.literal()
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (suggestionItems != null) __obj.updateDynamic("suggestionItems")(suggestionItems)
    __obj.asInstanceOf[IBaseExtendedPickerState[T]]
  }
}

