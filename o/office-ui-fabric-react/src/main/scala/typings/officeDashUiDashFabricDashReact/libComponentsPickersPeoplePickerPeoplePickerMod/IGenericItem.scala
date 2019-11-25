package typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod

import typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenericItem extends js.Object {
  var ValidationState: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
  var imageInitials: String
  var primaryText: String
}

object IGenericItem {
  @scala.inline
  def apply(ValidationState: ValidationState, imageInitials: String, primaryText: String): IGenericItem = {
    val __obj = js.Dynamic.literal(ValidationState = ValidationState.asInstanceOf[js.Any], imageInitials = imageInitials.asInstanceOf[js.Any], primaryText = primaryText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericItem]
  }
}

