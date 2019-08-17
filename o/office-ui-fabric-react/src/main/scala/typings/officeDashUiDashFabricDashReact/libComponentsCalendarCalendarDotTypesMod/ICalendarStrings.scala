package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarStrings extends js.Object {
  /**
    * Aria-label for the "close" button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * An array of strings for the full names of days of the week.
    * The array is 0-based, so days[0] should be the full name of Sunday.
    */
  var days: js.Array[String]
  /**
    * String to render for button to direct the user to today's date.
    */
  var goToToday: String
  /**
    * An array of strings for the full names of months.
    * The array is 0-based, so months[0] should be the full name of January.
    */
  var months: js.Array[String]
  /**
    * Aria-label for the "next month" button.
    */
  var nextMonthAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Aria-label for the "next year" button.
    */
  var nextYearAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Aria-label for the "next year range" button.
    */
  var nextYearRangeAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Aria-label for the "previous month" button.
    */
  var prevMonthAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Aria-label for the "previous year" button.
    */
  var prevYearAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Aria-label for the "previous year range" button.
    */
  var prevYearRangeAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * An array of strings for the initials of the days of the week.
    * The array is 0-based, so days[0] should be the initial of Sunday.
    */
  var shortDays: js.Array[String]
  /**
    * An array of strings for the short names of months.
    * The array is 0-based, so shortMonths[0] should be the short name of January.
    */
  var shortMonths: js.Array[String]
  /**
    * Aria-label format string for the week number header. Should have 1 string param e.g. "week number \{0\}"
    */
  var weekNumberFormatString: js.UndefOr[String] = js.undefined
}

object ICalendarStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    closeButtonAriaLabel: String = null,
    nextMonthAriaLabel: String = null,
    nextYearAriaLabel: String = null,
    nextYearRangeAriaLabel: String = null,
    prevMonthAriaLabel: String = null,
    prevYearAriaLabel: String = null,
    prevYearRangeAriaLabel: String = null,
    weekNumberFormatString: String = null
  ): ICalendarStrings = {
    val __obj = js.Dynamic.literal(days = days, goToToday = goToToday, months = months, shortDays = shortDays, shortMonths = shortMonths)
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel)
    if (nextMonthAriaLabel != null) __obj.updateDynamic("nextMonthAriaLabel")(nextMonthAriaLabel)
    if (nextYearAriaLabel != null) __obj.updateDynamic("nextYearAriaLabel")(nextYearAriaLabel)
    if (nextYearRangeAriaLabel != null) __obj.updateDynamic("nextYearRangeAriaLabel")(nextYearRangeAriaLabel)
    if (prevMonthAriaLabel != null) __obj.updateDynamic("prevMonthAriaLabel")(prevMonthAriaLabel)
    if (prevYearAriaLabel != null) __obj.updateDynamic("prevYearAriaLabel")(prevYearAriaLabel)
    if (prevYearRangeAriaLabel != null) __obj.updateDynamic("prevYearRangeAriaLabel")(prevYearRangeAriaLabel)
    if (weekNumberFormatString != null) __obj.updateDynamic("weekNumberFormatString")(weekNumberFormatString)
    __obj.asInstanceOf[ICalendarStrings]
  }
}

