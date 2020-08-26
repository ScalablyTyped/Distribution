package typings.officeUiFabricReact.calendarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarStrings extends js.Object {
  /**
    * Aria-label for the "close" button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * An array of strings for the full names of days of the week.
    * The array is 0-based, so days[0] should be the full name of Sunday.
    */
  var days: js.Array[String] = js.native
  /**
    * String to render for button to direct the user to today's date.
    */
  var goToToday: String = js.native
  /**
    * An array of strings for the full names of months.
    * The array is 0-based, so months[0] should be the full name of January.
    */
  var months: js.Array[String] = js.native
  /**
    * Aria-label for the "next month" button.
    */
  var nextMonthAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "next year" button.
    */
  var nextYearAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "next year range" button.
    */
  var nextYearRangeAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "previous month" button.
    */
  var prevMonthAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "previous year" button.
    */
  var prevYearAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "previous year range" button.
    */
  var prevYearRangeAriaLabel: js.UndefOr[String] = js.native
  /**
    * An array of strings for the initials of the days of the week.
    * The array is 0-based, so days[0] should be the initial of Sunday.
    */
  var shortDays: js.Array[String] = js.native
  /**
    * An array of strings for the short names of months.
    * The array is 0-based, so shortMonths[0] should be the short name of January.
    */
  var shortMonths: js.Array[String] = js.native
  /**
    * Aria-label format string for the week number header. Should have 1 string param e.g. "week number \{0\}"
    */
  var weekNumberFormatString: js.UndefOr[String] = js.native
}

object ICalendarStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): ICalendarStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarStrings]
  }
  @scala.inline
  implicit class ICalendarStringsOps[Self <: ICalendarStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToToday(value: String): Self = this.set("goToToday", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = this.set("shortDays", js.Array(value :_*))
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    @scala.inline
    def setNextMonthAriaLabel(value: String): Self = this.set("nextMonthAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMonthAriaLabel: Self = this.set("nextMonthAriaLabel", js.undefined)
    @scala.inline
    def setNextYearAriaLabel(value: String): Self = this.set("nextYearAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextYearAriaLabel: Self = this.set("nextYearAriaLabel", js.undefined)
    @scala.inline
    def setNextYearRangeAriaLabel(value: String): Self = this.set("nextYearRangeAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextYearRangeAriaLabel: Self = this.set("nextYearRangeAriaLabel", js.undefined)
    @scala.inline
    def setPrevMonthAriaLabel(value: String): Self = this.set("prevMonthAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevMonthAriaLabel: Self = this.set("prevMonthAriaLabel", js.undefined)
    @scala.inline
    def setPrevYearAriaLabel(value: String): Self = this.set("prevYearAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevYearAriaLabel: Self = this.set("prevYearAriaLabel", js.undefined)
    @scala.inline
    def setPrevYearRangeAriaLabel(value: String): Self = this.set("prevYearRangeAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevYearRangeAriaLabel: Self = this.set("prevYearRangeAriaLabel", js.undefined)
    @scala.inline
    def setWeekNumberFormatString(value: String): Self = this.set("weekNumberFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekNumberFormatString: Self = this.set("weekNumberFormatString", js.undefined)
  }
  
}

