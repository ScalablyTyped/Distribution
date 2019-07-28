package typings.momentDashRange.momentDashRangeMod

import typings.moment.momentMod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentRangeMethods extends js.Object {
  def isRange(range: js.Any): /* is moment-range.moment-range.DateRange */ Boolean = js.native
  def range(range: String): DateRange = js.native
  def range(range: js.Array[Date | Moment]): DateRange = js.native
  def range(start: Moment, end: Moment): DateRange = js.native
  def range(start: Moment, end: Date): DateRange = js.native
  def range(start: Date, end: Moment): DateRange = js.native
  def range(start: Date, end: Date): DateRange = js.native
  def within(range: DateRange): Boolean = js.native
}

