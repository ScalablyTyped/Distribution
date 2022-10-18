package typings.moment.ts3Dot1TypingsMomentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale_ extends StObject {
  
  def calendar(): String = js.native
  def calendar(key: Unit, m: Unit, now: Moment): String = js.native
  def calendar(key: Unit, m: Moment): String = js.native
  def calendar(key: Unit, m: Moment, now: Moment): String = js.native
  def calendar(key: CalendarKey): String = js.native
  def calendar(key: CalendarKey, m: Unit, now: Moment): String = js.native
  def calendar(key: CalendarKey, m: Moment): String = js.native
  def calendar(key: CalendarKey, m: Moment, now: Moment): String = js.native
  
  def firstDayOfWeek(): Double = js.native
  
  def firstDayOfYear(): Double = js.native
  
  def invalidDate(): String = js.native
  
  def isPM(input: String): Boolean = js.native
  
  def longDateFormat(key: LongDateFormatKey): String = js.native
  
  def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
  
  def months(): js.Array[String] = js.native
  def months(m: Moment): String = js.native
  def months(m: Moment, format: String): String = js.native
  
  def monthsParse(monthName: String, format: String, strict: Boolean): Double = js.native
  
  def monthsRegex(strict: Boolean): js.RegExp = js.native
  
  def monthsShort(): js.Array[String] = js.native
  def monthsShort(m: Moment): String = js.native
  def monthsShort(m: Moment, format: String): String = js.native
  
  def monthsShortRegex(strict: Boolean): js.RegExp = js.native
  
  def ordinal(n: Double): String = js.native
  
  def pastFuture(diff: Double, absRelTime: String): String = js.native
  
  def postformat(inp: String): String = js.native
  
  def preparse(inp: String): String = js.native
  
  def relativeTime(n: Double, withoutSuffix: Boolean, key: RelativeTimeKey, isFuture: Boolean): String = js.native
  
  def set(config: js.Object): Unit = js.native
  
  def week(m: Moment): Double = js.native
  
  def weekdays(): js.Array[String] = js.native
  def weekdays(m: Moment): String = js.native
  def weekdays(m: Moment, format: String): String = js.native
  
  def weekdaysMin(): js.Array[String] = js.native
  def weekdaysMin(m: Moment): String = js.native
  
  def weekdaysMinRegex(strict: Boolean): js.RegExp = js.native
  
  def weekdaysParse(weekdayName: String, format: String, strict: Boolean): Double = js.native
  
  def weekdaysRegex(strict: Boolean): js.RegExp = js.native
  
  def weekdaysShort(): js.Array[String] = js.native
  def weekdaysShort(m: Moment): String = js.native
  
  def weekdaysShortRegex(strict: Boolean): js.RegExp = js.native
}
