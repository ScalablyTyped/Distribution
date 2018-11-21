package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICalendarStrings extends js.Object {
  /**
       * Aria-label for the "close" button.
       */
  var closeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An array of strings for the full names of days of the week.
       * The array is 0-based, so days[0] should be the full name of Sunday.
       */
  var days: js.Array[java.lang.String]
  /**
       * String to render for button to direct the user to today's date.
       */
  var goToToday: java.lang.String
  /**
       * An array of strings for the full names of months.
       * The array is 0-based, so months[0] should be the full name of January.
       */
  var months: js.Array[java.lang.String]
  /**
       * Aria-label for the "next month" button.
       */
  var nextMonthAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Aria-label for the "next year" button.
       */
  var nextYearAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Aria-label for the "previous month" button.
       */
  var prevMonthAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Aria-label for the "previous year" button.
       */
  var prevYearAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An array of strings for the initials of the days of the week.
       * The array is 0-based, so days[0] should be the initial of Sunday.
       */
  var shortDays: js.Array[java.lang.String]
  /**
       * An array of strings for the short names of months.
       * The array is 0-based, so shortMonths[0] should be the short name of January.
       */
  var shortMonths: js.Array[java.lang.String]
  /**
       * Aria-label format string for the week number header. Should have 1 string param e.g. "week number {0}"
       */
  var weekNumberFormatString: js.UndefOr[java.lang.String] = js.undefined
}

