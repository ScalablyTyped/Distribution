package typings
package momentDashRangeLib.momentDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-range", "DateRange")
@js.native
class DateRange protected () extends js.Object {
  def this(range: java.lang.String) = this()
  def this(range: js.Array[stdLib.Date | momentLib.momentMod.momentNs.Moment]) = this()
  def this(start: momentLib.momentMod.momentNs.Moment, end: momentLib.momentMod.momentNs.Moment) = this()
  def this(start: momentLib.momentMod.momentNs.Moment, end: stdLib.Date) = this()
  def this(start: stdLib.Date, end: momentLib.momentMod.momentNs.Moment) = this()
  def this(start: stdLib.Date, end: stdLib.Date) = this()
  var end: momentLib.momentMod.momentNs.Moment = js.native
  var start: momentLib.momentMod.momentNs.Moment = js.native
  def add(other: DateRange): DateRange = js.native
  def add(other: DateRange, options: momentDashRangeLib.Anon_Adjacent): DateRange = js.native
  def adjacent(other: DateRange): scala.Boolean = js.native
  def by(interval: momentLib.momentMod.momentNs.unitOfTimeNs.Diff): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def by(
    interval: momentLib.momentMod.momentNs.unitOfTimeNs.Diff,
    options: momentDashRangeLib.Anon_ExclusiveStep
  ): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def byRange(interval: DateRange): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def byRange(interval: DateRange, options: momentDashRangeLib.Anon_ExclusiveStep): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def center(): momentLib.momentMod.momentNs.Moment = js.native
  def contains(other: DateRange): scala.Boolean = js.native
  def contains(other: DateRange, options: momentDashRangeLib.Anon_Exclusive): scala.Boolean = js.native
  def contains(other: momentLib.momentMod.momentNs.Moment): scala.Boolean = js.native
  def contains(other: momentLib.momentMod.momentNs.Moment, options: momentDashRangeLib.Anon_Exclusive): scala.Boolean = js.native
  def contains(other: stdLib.Date): scala.Boolean = js.native
  def contains(other: stdLib.Date, options: momentDashRangeLib.Anon_Exclusive): scala.Boolean = js.native
  def diff(): scala.Double = js.native
  def diff(unit: momentLib.momentMod.momentNs.unitOfTimeNs.Diff): scala.Double = js.native
  def diff(unit: momentLib.momentMod.momentNs.unitOfTimeNs.Diff, rounded: scala.Boolean): scala.Double = js.native
  def duration(): scala.Double = js.native
  def duration(unit: momentLib.momentMod.momentNs.unitOfTimeNs.Diff): scala.Double = js.native
  def duration(unit: momentLib.momentMod.momentNs.unitOfTimeNs.Diff, precise: scala.Boolean): scala.Double = js.native
  def intersect(other: DateRange): DateRange = js.native
  def isEqual(other: DateRange): scala.Boolean = js.native
  def isSame(other: DateRange): scala.Boolean = js.native
  def overlaps(range: DateRange): scala.Boolean = js.native
  def overlaps(range: DateRange, options: momentDashRangeLib.Anon_Adjacent): scala.Boolean = js.native
  def reverseBy(interval: momentLib.momentMod.momentNs.unitOfTimeNs.Diff): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def reverseBy(
    interval: momentLib.momentMod.momentNs.unitOfTimeNs.Diff,
    options: momentDashRangeLib.Anon_ExclusiveStep
  ): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def reverseByRange(interval: DateRange): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def reverseByRange(interval: DateRange, options: momentDashRangeLib.Anon_ExclusiveStep): stdLib.Iterable[momentLib.momentMod.momentNs.Moment] = js.native
  def subtract(other: DateRange): js.Array[DateRange] = js.native
  def toDate(): js.Array[stdLib.Date] = js.native
}

