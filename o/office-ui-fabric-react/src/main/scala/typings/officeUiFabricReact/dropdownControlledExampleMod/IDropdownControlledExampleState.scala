package typings.officeUiFabricReact.dropdownControlledExampleMod

import typings.officeUiFabricReact.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownControlledExampleState extends js.Object {
  var selectedItem: js.UndefOr[AnonKey] = js.undefined
}

object IDropdownControlledExampleState {
  @scala.inline
  def apply(selectedItem: AnonKey = null): IDropdownControlledExampleState = {
    val __obj = js.Dynamic.literal()
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownControlledExampleState]
  }
}

