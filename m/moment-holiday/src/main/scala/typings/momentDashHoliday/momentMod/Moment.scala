package typings.momentDashHoliday.momentMod

import org.scalablytyped.runtime.StringDictionary
import typings.momentDashHoliday.momentDashHolidayBooleans.`false`
import typings.std.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends Object {
  def holiday(): Moment | `false` | StringDictionary[Moment] = js.native
  def holiday(holidays: String): Moment | `false` | StringDictionary[Moment] = js.native
  def holiday(holidays: String, adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
  def holiday(holidays: js.Array[String]): Moment | `false` | StringDictionary[Moment] = js.native
  def holiday(holidays: js.Array[String], adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
  def holidays(): Moment | `false` | StringDictionary[Moment] = js.native
  def holidays(holidays: String): Moment | `false` | StringDictionary[Moment] = js.native
  def holidays(holidays: String, adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
  def holidays(holidays: js.Array[String]): Moment | `false` | StringDictionary[Moment] = js.native
  def holidays(holidays: js.Array[String], adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
  def holidaysBetween(m: Moment): js.Array[Moment] | `false` = js.native
  def holidaysBetween(m: Moment, adjust: Boolean): js.Array[Moment] | `false` = js.native
  def isHoliday(): Boolean | String | js.Array[String] = js.native
  def isHoliday(holidays: String): Boolean | String | js.Array[String] = js.native
  def isHoliday(holidays: String, adjust: Boolean): Boolean | String | js.Array[String] = js.native
  def isHoliday(holidays: js.Array[String]): Boolean | String | js.Array[String] = js.native
  def isHoliday(holidays: js.Array[String], adjust: Boolean): Boolean | String | js.Array[String] = js.native
  def isHoliday(holidays: Null, adjust: Boolean): Boolean | String | js.Array[String] = js.native
  def nextHoliday(): js.Array[Moment] | Moment = js.native
  def nextHoliday(count: Double): js.Array[Moment] | Moment = js.native
  def nextHoliday(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
  def nextHolidays(): js.Array[Moment] | Moment = js.native
  def nextHolidays(count: Double): js.Array[Moment] | Moment = js.native
  def nextHolidays(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
  def previousHoliday(): js.Array[Moment] | Moment = js.native
  def previousHoliday(count: Double): js.Array[Moment] | Moment = js.native
  def previousHoliday(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
  def previousHolidays(): js.Array[Moment] | Moment = js.native
  def previousHolidays(count: Double): js.Array[Moment] | Moment = js.native
  def previousHolidays(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
}

