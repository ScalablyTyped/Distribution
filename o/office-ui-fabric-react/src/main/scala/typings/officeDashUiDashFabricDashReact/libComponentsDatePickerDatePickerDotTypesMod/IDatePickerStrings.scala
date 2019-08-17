package typings.officeDashUiDashFabricDashReact.libComponentsDatePickerDatePickerDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarStrings
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
    val __obj = js.Dynamic.literal(days = days, goToToday = goToToday, months = months, shortDays = shortDays, shortMonths = shortMonths)
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel)
    if (invalidInputErrorMessage != null) __obj.updateDynamic("invalidInputErrorMessage")(invalidInputErrorMessage)
    if (isOutOfBoundsErrorMessage != null) __obj.updateDynamic("isOutOfBoundsErrorMessage")(isOutOfBoundsErrorMessage)
    if (isRequiredErrorMessage != null) __obj.updateDynamic("isRequiredErrorMessage")(isRequiredErrorMessage)
    if (nextMonthAriaLabel != null) __obj.updateDynamic("nextMonthAriaLabel")(nextMonthAriaLabel)
    if (nextYearAriaLabel != null) __obj.updateDynamic("nextYearAriaLabel")(nextYearAriaLabel)
    if (nextYearRangeAriaLabel != null) __obj.updateDynamic("nextYearRangeAriaLabel")(nextYearRangeAriaLabel)
    if (prevMonthAriaLabel != null) __obj.updateDynamic("prevMonthAriaLabel")(prevMonthAriaLabel)
    if (prevYearAriaLabel != null) __obj.updateDynamic("prevYearAriaLabel")(prevYearAriaLabel)
    if (prevYearRangeAriaLabel != null) __obj.updateDynamic("prevYearRangeAriaLabel")(prevYearRangeAriaLabel)
    if (weekNumberFormatString != null) __obj.updateDynamic("weekNumberFormatString")(weekNumberFormatString)
    __obj.asInstanceOf[IDatePickerStrings]
  }
}

