package typings.officeDashUiDashFabricDashReact.libComponentsDropdownExamplesDropdownDotControlledDotExampleMod

import typings.officeDashUiDashFabricDashReact.Anon_KeyNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownControlledExampleState extends js.Object {
  var selectedItem: js.UndefOr[Anon_KeyNumber] = js.undefined
}

object IDropdownControlledExampleState {
  @scala.inline
  def apply(selectedItem: Anon_KeyNumber = null): IDropdownControlledExampleState = {
    val __obj = js.Dynamic.literal()
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownControlledExampleState]
  }
}

