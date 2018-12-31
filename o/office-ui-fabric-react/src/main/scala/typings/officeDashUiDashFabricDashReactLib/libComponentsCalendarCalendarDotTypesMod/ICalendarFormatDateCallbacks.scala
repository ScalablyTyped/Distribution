package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarFormatDateCallbacks extends js.Object {
  /**
    * Callback to apply formatting to the days in the Day Picker calendar
    */
  def formatDay(date: stdLib.Date): java.lang.String = js.native
  /**
    * Callback to apply formatting to mmmm d, yyyy formated dates
    */
  def formatMonthDayYear(date: stdLib.Date): java.lang.String = js.native
  def formatMonthDayYear(date: stdLib.Date, strings: ICalendarStrings): java.lang.String = js.native
  /**
    * Callback to apply formatting to the month and year in the Day Picker header
    */
  def formatMonthYear(date: stdLib.Date): java.lang.String = js.native
  def formatMonthYear(date: stdLib.Date, strings: ICalendarStrings): java.lang.String = js.native
  /**
    * Callback to apply formatting to the year in the Month Picker header
    */
  def formatYear(date: stdLib.Date): java.lang.String = js.native
}

