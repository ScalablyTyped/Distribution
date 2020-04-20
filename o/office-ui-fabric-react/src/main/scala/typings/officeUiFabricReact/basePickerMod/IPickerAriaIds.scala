package typings.officeUiFabricReact.basePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerAriaIds extends js.Object {
  /**
    * Aria id for selected items container component
    */
  var selectedItems: String
  /**
    * Aria id for selected suggestion alert component
    */
  var selectedSuggestionAlert: String
  /**
    * Aria id for suggestions list component
    */
  var suggestionList: String
}

object IPickerAriaIds {
  @scala.inline
  def apply(selectedItems: String, selectedSuggestionAlert: String, suggestionList: String): IPickerAriaIds = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any], selectedSuggestionAlert = selectedSuggestionAlert.asInstanceOf[js.Any], suggestionList = suggestionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerAriaIds]
  }
}

