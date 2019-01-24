package typings
package momentDashRangeLib.momentDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentRangeMethods extends js.Object {
  def isRange(range: js.Any): /* is moment-range.moment-range.DateRange */ scala.Boolean = js.native
  def range(range: java.lang.String): DateRange = js.native
  def range(range: js.Array[stdLib.Date | momentLib.momentMod.momentNs.Moment]): DateRange = js.native
  def range(start: momentLib.momentMod.momentNs.Moment, end: momentLib.momentMod.momentNs.Moment): DateRange = js.native
  def range(start: momentLib.momentMod.momentNs.Moment, end: stdLib.Date): DateRange = js.native
  def range(start: stdLib.Date, end: momentLib.momentMod.momentNs.Moment): DateRange = js.native
  def range(start: stdLib.Date, end: stdLib.Date): DateRange = js.native
  def within(range: DateRange): scala.Boolean = js.native
}

