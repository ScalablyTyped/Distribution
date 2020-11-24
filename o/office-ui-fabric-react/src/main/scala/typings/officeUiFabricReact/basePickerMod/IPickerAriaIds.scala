package typings.officeUiFabricReact.basePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPickerAriaIds extends js.Object {
  
  /**
    * Aria id for selected items container component
    */
  var selectedItems: String = js.native
  
  /**
    * Aria id for selected suggestion alert component
    */
  var selectedSuggestionAlert: String = js.native
  
  /**
    * Aria id for suggestions list component
    */
  var suggestionList: String = js.native
}
object IPickerAriaIds {
  
  @scala.inline
  def apply(selectedItems: String, selectedSuggestionAlert: String, suggestionList: String): IPickerAriaIds = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any], selectedSuggestionAlert = selectedSuggestionAlert.asInstanceOf[js.Any], suggestionList = suggestionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerAriaIds]
  }
  
  @scala.inline
  implicit class IPickerAriaIdsOps[Self <: IPickerAriaIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSelectedItems(value: String): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedSuggestionAlert(value: String): Self = this.set("selectedSuggestionAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionList(value: String): Self = this.set("suggestionList", value.asInstanceOf[js.Any])
  }
}
