package typings.officeUiFabricReact.dropdownControlledExampleMod

import typings.officeUiFabricReact.AnonKeyNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownControlledExampleState extends js.Object {
  var selectedItem: js.UndefOr[AnonKeyNumber] = js.undefined
}

object IDropdownControlledExampleState {
  @scala.inline
  def apply(selectedItem: AnonKeyNumber = null): IDropdownControlledExampleState = {
    val __obj = js.Dynamic.literal()
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownControlledExampleState]
  }
}

