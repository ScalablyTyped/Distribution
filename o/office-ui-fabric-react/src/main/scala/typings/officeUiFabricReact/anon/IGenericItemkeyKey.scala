package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker.IGenericItem & {  key :react.react.Key} */
@js.native
trait IGenericItemkeyKey extends js.Object {
  var ValidationState: typings.officeUiFabricReact.basePickerTypesMod.ValidationState = js.native
  var imageInitials: String = js.native
  var key: typings.react.mod.Key = js.native
  var primaryText: String = js.native
}

object IGenericItemkeyKey {
  @scala.inline
  def apply(
    ValidationState: ValidationState,
    imageInitials: String,
    key: typings.react.mod.Key,
    primaryText: String
  ): IGenericItemkeyKey = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericItemkeyKey]
  }
  @scala.inline
  implicit class IGenericItemkeyKeyOps[Self <: IGenericItemkeyKey] (val x: Self) extends AnyVal {
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
    def setKey(value: typings.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryText(value: String): Self = this.set("primaryText", value.asInstanceOf[js.Any])
  }
  
}

