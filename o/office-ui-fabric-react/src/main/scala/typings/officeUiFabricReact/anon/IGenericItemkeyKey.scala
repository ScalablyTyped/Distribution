package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePicker.IGenericItem & {  key  :react.react.Key} */
trait IGenericItemkeyKey extends js.Object {
  var ValidationState: typings.officeUiFabricReact.basePickerTypesMod.ValidationState
  var imageInitials: String
  var key: typings.react.mod.Key
  var primaryText: String
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
}

