package typings.officeDashUiDashFabricDashReact.libComponentsCalendarExamplesCalendarDotButtonDotExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarButtonExampleProps extends js.Object {
  var buttonString: js.UndefOr[String] = js.undefined
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined
  var isDayPickerVisible: js.UndefOr[Boolean] = js.undefined
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
  var showGoToToday: js.UndefOr[Boolean] = js.undefined
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined
}

object ICalendarButtonExampleProps {
  @scala.inline
  def apply(
    buttonString: String = null,
    highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isDayPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    showGoToToday: js.UndefOr[Boolean] = js.undefined,
    showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined
  ): ICalendarButtonExampleProps = {
    val __obj = js.Dynamic.literal()
    if (buttonString != null) __obj.updateDynamic("buttonString")(buttonString.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCurrentMonth)) __obj.updateDynamic("highlightCurrentMonth")(highlightCurrentMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelectedMonth)) __obj.updateDynamic("highlightSelectedMonth")(highlightSelectedMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(isDayPickerVisible)) __obj.updateDynamic("isDayPickerVisible")(isDayPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(showGoToToday)) __obj.updateDynamic("showGoToToday")(showGoToToday.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthPickerAsOverlay)) __obj.updateDynamic("showMonthPickerAsOverlay")(showMonthPickerAsOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarButtonExampleProps]
  }
}

