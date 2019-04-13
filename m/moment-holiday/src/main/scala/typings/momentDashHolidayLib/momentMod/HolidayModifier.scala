package typings
package momentDashHolidayLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolidayModifier extends js.Object {
  def add(holidays: java.lang.String): HolidayModifier = js.native
  def add(holidays: java.lang.String, specifics: js.Any): HolidayModifier = js.native
  def add(holidays: HolidaysMapping): HolidayModifier = js.native
  def add(holidays: HolidaysMapping, specifics: js.Any): HolidayModifier = js.native
  def extendParser(
    parserFunc: js.Function2[
      /* m */ momentLib.momentMod.Moment, 
      /* date */ java.lang.String, 
      momentLib.momentMod.Moment | js.Array[momentLib.momentMod.Moment] | momentDashHolidayLib.momentDashHolidayLibNumbers.`false` | scala.Unit
    ]
  ): HolidayModifier = js.native
  def load(locales: java.lang.String): HolidayModifier = js.native
  def load(locales: js.Array[java.lang.String]): HolidayModifier = js.native
  def remove(holidays: java.lang.String): HolidayModifier = js.native
  def remove(holidays: js.Array[java.lang.String]): HolidayModifier = js.native
  def set(holidays: java.lang.String): HolidayModifier = js.native
  def set(holidays: java.lang.String, specifics: js.Any): HolidayModifier = js.native
  def set(holidays: js.Array[java.lang.String]): HolidayModifier = js.native
  def set(holidays: js.Array[java.lang.String], specifics: js.Any): HolidayModifier = js.native
  def set(holidays: HolidaysMapping): HolidayModifier = js.native
  def set(holidays: HolidaysMapping, specifics: js.Any): HolidayModifier = js.native
  def undo(): HolidayModifier = js.native
}

