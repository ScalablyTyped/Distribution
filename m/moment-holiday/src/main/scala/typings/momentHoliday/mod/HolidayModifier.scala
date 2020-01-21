package typings.momentHoliday.mod

import typings.momentHoliday.momentHolidayBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolidayModifier extends js.Object {
  def add(holidays: String): HolidayModifier = js.native
  def add(holidays: String, specifics: js.Any): HolidayModifier = js.native
  def add(holidays: HolidaysMapping): HolidayModifier = js.native
  def add(holidays: HolidaysMapping, specifics: js.Any): HolidayModifier = js.native
  @JSName("extendParser")
  def extendParser_false(
    parserFunc: js.Function2[/* m */ Moment, /* date */ String, Moment | js.Array[Moment] | `false` | Unit]
  ): HolidayModifier = js.native
  def load(locales: String): HolidayModifier = js.native
  def load(locales: js.Array[String]): HolidayModifier = js.native
  def remove(holidays: String): HolidayModifier = js.native
  def remove(holidays: js.Array[String]): HolidayModifier = js.native
  def set(holidays: String): HolidayModifier = js.native
  def set(holidays: String, specifics: js.Any): HolidayModifier = js.native
  def set(holidays: js.Array[String]): HolidayModifier = js.native
  def set(holidays: js.Array[String], specifics: js.Any): HolidayModifier = js.native
  def set(holidays: HolidaysMapping): HolidayModifier = js.native
  def set(holidays: HolidaysMapping, specifics: js.Any): HolidayModifier = js.native
  def undo(): HolidayModifier = js.native
}

