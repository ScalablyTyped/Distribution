package typings.officeDashUiDashFabricDashReact.libComponentsDatePickerDatePickerDotBaseMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerState extends js.Object {
  var errorMessage: js.UndefOr[String] = js.undefined
  var formattedDate: js.UndefOr[String] = js.undefined
  var isDatePickerShown: js.UndefOr[Boolean] = js.undefined
  var selectedDate: js.UndefOr[Date] = js.undefined
}

object IDatePickerState {
  @scala.inline
  def apply(
    errorMessage: String = null,
    formattedDate: String = null,
    isDatePickerShown: js.UndefOr[Boolean] = js.undefined,
    selectedDate: Date = null
  ): IDatePickerState = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (formattedDate != null) __obj.updateDynamic("formattedDate")(formattedDate)
    if (!js.isUndefined(isDatePickerShown)) __obj.updateDynamic("isDatePickerShown")(isDatePickerShown)
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate)
    __obj.asInstanceOf[IDatePickerState]
  }
}

