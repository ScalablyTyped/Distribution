package typings.officeUiFabricReact.pickerCustomResultExampleMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerExampleState extends js.Object {
  var contextualMenuTarget: js.UndefOr[HTMLElement] = js.undefined
  var contextualMenuVisible: js.UndefOr[Boolean] = js.undefined
  var isPickerDisabled: js.UndefOr[Boolean] = js.undefined
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(
    contextualMenuTarget: HTMLElement = null,
    contextualMenuVisible: js.UndefOr[Boolean] = js.undefined,
    isPickerDisabled: js.UndefOr[Boolean] = js.undefined
  ): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal()
    if (contextualMenuTarget != null) __obj.updateDynamic("contextualMenuTarget")(contextualMenuTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(contextualMenuVisible)) __obj.updateDynamic("contextualMenuVisible")(contextualMenuVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isPickerDisabled)) __obj.updateDynamic("isPickerDisabled")(isPickerDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
}

