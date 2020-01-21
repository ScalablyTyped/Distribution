package typings.officeUiFabricReact.calendarCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarState extends js.Object {
  /** State used to show/hide day picker */
  var isDayPickerVisible: js.UndefOr[Boolean] = js.undefined
  /** State used to show/hide month picker */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
  /** The currently focused date in the day picker, but not necessarily selected */
  var navigatedDayDate: js.UndefOr[Date] = js.undefined
  /** The currently focused date in the month picker, but not necessarily selected */
  var navigatedMonthDate: js.UndefOr[Date] = js.undefined
  /** The currently selected date in the calendar */
  var selectedDate: js.UndefOr[Date] = js.undefined
}

object ICalendarState {
  @scala.inline
  def apply(
    isDayPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    navigatedDayDate: Date = null,
    navigatedMonthDate: Date = null,
    selectedDate: Date = null
  ): ICalendarState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDayPickerVisible)) __obj.updateDynamic("isDayPickerVisible")(isDayPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible.asInstanceOf[js.Any])
    if (navigatedDayDate != null) __obj.updateDynamic("navigatedDayDate")(navigatedDayDate.asInstanceOf[js.Any])
    if (navigatedMonthDate != null) __obj.updateDynamic("navigatedMonthDate")(navigatedMonthDate.asInstanceOf[js.Any])
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarState]
  }
}

