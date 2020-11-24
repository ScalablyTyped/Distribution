package typings.officeUiFabricReact.peoplePickerMod

import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGenericItem extends js.Object {
  
  var ValidationState: typings.officeUiFabricReact.basePickerTypesMod.ValidationState = js.native
  
  var imageInitials: String = js.native
  
  var primaryText: String = js.native
}
object IGenericItem {
  
  @scala.inline
  def apply(ValidationState: ValidationState, imageInitials: String, primaryText: String): IGenericItem = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericItem]
  }
  
  @scala.inline
  implicit class IGenericItemOps[Self <: IGenericItem] (val x: Self) extends AnyVal {
    
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
    def setValidationState(value: ValidationState): Self = this.set("ValidationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInitials(value: String): Self = this.set("imageInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryText(value: String): Self = this.set("primaryText", value.asInstanceOf[js.Any])
  }
}
