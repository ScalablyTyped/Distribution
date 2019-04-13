package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  def calendar(): java.lang.String = js.native
  def calendar(key: CalendarKey): java.lang.String = js.native
  def calendar(key: CalendarKey, m: Moment): java.lang.String = js.native
  def calendar(key: CalendarKey, m: Moment, now: Moment): java.lang.String = js.native
  def firstDayOfWeek(): scala.Double = js.native
  def firstDayOfYear(): scala.Double = js.native
  def invalidDate(): java.lang.String = js.native
  def isPM(input: java.lang.String): scala.Boolean = js.native
  def longDateFormat(key: LongDateFormatKey): java.lang.String = js.native
  def meridiem(hour: scala.Double, minute: scala.Double, isLower: scala.Boolean): java.lang.String = js.native
  def months(): js.Array[java.lang.String] = js.native
  def months(m: Moment): java.lang.String = js.native
  def months(m: Moment, format: java.lang.String): java.lang.String = js.native
  def monthsParse(monthName: java.lang.String, format: java.lang.String, strict: scala.Boolean): scala.Double = js.native
  def monthsRegex(strict: scala.Boolean): stdLib.RegExp = js.native
  def monthsShort(): js.Array[java.lang.String] = js.native
  def monthsShort(m: Moment): java.lang.String = js.native
  def monthsShort(m: Moment, format: java.lang.String): java.lang.String = js.native
  def monthsShortRegex(strict: scala.Boolean): stdLib.RegExp = js.native
  def ordinal(n: scala.Double): java.lang.String = js.native
  def pastFuture(diff: scala.Double, absRelTime: java.lang.String): java.lang.String = js.native
  def postformat(inp: java.lang.String): java.lang.String = js.native
  def preparse(inp: java.lang.String): java.lang.String = js.native
  def relativeTime(n: scala.Double, withoutSuffix: scala.Boolean, key: RelativeTimeKey, isFuture: scala.Boolean): java.lang.String = js.native
  def set(config: js.Object): scala.Unit = js.native
  def week(m: Moment): scala.Double = js.native
  def weekdays(): js.Array[java.lang.String] = js.native
  def weekdays(m: Moment): java.lang.String = js.native
  def weekdays(m: Moment, format: java.lang.String): java.lang.String = js.native
  def weekdaysMin(): js.Array[java.lang.String] = js.native
  def weekdaysMin(m: Moment): java.lang.String = js.native
  def weekdaysMinRegex(strict: scala.Boolean): stdLib.RegExp = js.native
  def weekdaysParse(weekdayName: java.lang.String, format: java.lang.String, strict: scala.Boolean): scala.Double = js.native
  def weekdaysRegex(strict: scala.Boolean): stdLib.RegExp = js.native
  def weekdaysShort(): js.Array[java.lang.String] = js.native
  def weekdaysShort(m: Moment): java.lang.String = js.native
  def weekdaysShortRegex(strict: scala.Boolean): stdLib.RegExp = js.native
}

