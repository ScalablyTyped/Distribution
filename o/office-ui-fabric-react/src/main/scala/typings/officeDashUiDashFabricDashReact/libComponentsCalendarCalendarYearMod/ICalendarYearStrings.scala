package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearStrings extends js.Object {
  var nextRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
  var prevRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
  var rangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
}

object ICalendarYearStrings {
  @scala.inline
  def apply(
    nextRangeAriaLabel: String | ICalendarYearRangeToString = null,
    prevRangeAriaLabel: String | ICalendarYearRangeToString = null,
    rangeAriaLabel: String | ICalendarYearRangeToString = null
  ): ICalendarYearStrings = {
    val __obj = js.Dynamic.literal()
    if (nextRangeAriaLabel != null) __obj.updateDynamic("nextRangeAriaLabel")(nextRangeAriaLabel.asInstanceOf[js.Any])
    if (prevRangeAriaLabel != null) __obj.updateDynamic("prevRangeAriaLabel")(prevRangeAriaLabel.asInstanceOf[js.Any])
    if (rangeAriaLabel != null) __obj.updateDynamic("rangeAriaLabel")(rangeAriaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearStrings]
  }
}

