package typings.officeUiFabricReact.baseExtendedPickerMod

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
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], suggestionItems = suggestionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseExtendedPickerState[T]]
  }
}

