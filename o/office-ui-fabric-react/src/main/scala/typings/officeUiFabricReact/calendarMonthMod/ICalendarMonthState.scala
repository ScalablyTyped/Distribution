package typings.officeUiFabricReact.calendarMonthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarMonthState extends js.Object {
  /** State used to show/hide month picker */
  var isYearPickerVisible: js.UndefOr[Boolean] = js.undefined
}

object ICalendarMonthState {
  @scala.inline
  def apply(isYearPickerVisible: js.UndefOr[Boolean] = js.undefined): ICalendarMonthState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isYearPickerVisible)) __obj.updateDynamic("isYearPickerVisible")(isYearPickerVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarMonthState]
  }
}

