package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod

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
    val __obj = js.Dynamic.literal(selectedItems = selectedItems, selectedSuggestionAlert = selectedSuggestionAlert, suggestionList = suggestionList)
  
    __obj.asInstanceOf[IPickerAriaIds]
  }
}

