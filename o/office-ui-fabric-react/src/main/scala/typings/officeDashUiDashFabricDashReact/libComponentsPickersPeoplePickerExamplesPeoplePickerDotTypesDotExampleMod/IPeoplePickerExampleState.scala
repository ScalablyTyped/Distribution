package typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerExamplesPeoplePickerDotTypesDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerExampleState extends js.Object {
  var currentPicker: js.UndefOr[Double | String] = js.undefined
  var currentSelectedItems: js.UndefOr[js.Array[IPersonaProps]] = js.undefined
  var delayResults: js.UndefOr[Boolean] = js.undefined
  var isPickerDisabled: js.UndefOr[Boolean] = js.undefined
  var mostRecentlyUsed: js.Array[IPersonaProps]
  var peopleList: js.Array[IPersonaProps]
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(
    mostRecentlyUsed: js.Array[IPersonaProps],
    peopleList: js.Array[IPersonaProps],
    currentPicker: Double | String = null,
    currentSelectedItems: js.Array[IPersonaProps] = null,
    delayResults: js.UndefOr[Boolean] = js.undefined,
    isPickerDisabled: js.UndefOr[Boolean] = js.undefined
  ): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal(mostRecentlyUsed = mostRecentlyUsed.asInstanceOf[js.Any], peopleList = peopleList.asInstanceOf[js.Any])
    if (currentPicker != null) __obj.updateDynamic("currentPicker")(currentPicker.asInstanceOf[js.Any])
    if (currentSelectedItems != null) __obj.updateDynamic("currentSelectedItems")(currentSelectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(delayResults)) __obj.updateDynamic("delayResults")(delayResults.asInstanceOf[js.Any])
    if (!js.isUndefined(isPickerDisabled)) __obj.updateDynamic("isPickerDisabled")(isPickerDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
}

