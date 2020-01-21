package typings.officeUiFabricReact.datePickerTypesMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerStrings extends ICalendarStrings {
  /**
    * Error message to render for TextField if input date string parsing fails.
    */
  var invalidInputErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * Error message to render for TextField if date boundary (minDate, maxDate) validation fails.
    */
  var isOutOfBoundsErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * Error message to render for TextField if isRequired validation fails.
    */
  var isRequiredErrorMessage: js.UndefOr[String] = js.undefined
}

object IDatePickerStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    closeButtonAriaLabel: String = null,
    invalidInputErrorMessage: String = null,
    isOutOfBoundsErrorMessage: String = null,
    isRequiredErrorMessage: String = null,
    nextMonthAriaLabel: String = null,
    nextYearAriaLabel: String = null,
    nextYearRangeAriaLabel: String = null,
    prevMonthAriaLabel: String = null,
    prevYearAriaLabel: String = null,
    prevYearRangeAriaLabel: String = null,
    weekNumberFormatString: String = null
  ): IDatePickerStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (invalidInputErrorMessage != null) __obj.updateDynamic("invalidInputErrorMessage")(invalidInputErrorMessage.asInstanceOf[js.Any])
    if (isOutOfBoundsErrorMessage != null) __obj.updateDynamic("isOutOfBoundsErrorMessage")(isOutOfBoundsErrorMessage.asInstanceOf[js.Any])
    if (isRequiredErrorMessage != null) __obj.updateDynamic("isRequiredErrorMessage")(isRequiredErrorMessage.asInstanceOf[js.Any])
    if (nextMonthAriaLabel != null) __obj.updateDynamic("nextMonthAriaLabel")(nextMonthAriaLabel.asInstanceOf[js.Any])
    if (nextYearAriaLabel != null) __obj.updateDynamic("nextYearAriaLabel")(nextYearAriaLabel.asInstanceOf[js.Any])
    if (nextYearRangeAriaLabel != null) __obj.updateDynamic("nextYearRangeAriaLabel")(nextYearRangeAriaLabel.asInstanceOf[js.Any])
    if (prevMonthAriaLabel != null) __obj.updateDynamic("prevMonthAriaLabel")(prevMonthAriaLabel.asInstanceOf[js.Any])
    if (prevYearAriaLabel != null) __obj.updateDynamic("prevYearAriaLabel")(prevYearAriaLabel.asInstanceOf[js.Any])
    if (prevYearRangeAriaLabel != null) __obj.updateDynamic("prevYearRangeAriaLabel")(prevYearRangeAriaLabel.asInstanceOf[js.Any])
    if (weekNumberFormatString != null) __obj.updateDynamic("weekNumberFormatString")(weekNumberFormatString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStrings]
  }
}

