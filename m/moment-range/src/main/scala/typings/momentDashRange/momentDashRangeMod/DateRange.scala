package typings.momentDashRange.momentDashRangeMod

import typings.moment.momentMod.Moment
import typings.moment.momentMod.unitOfTimeNs.Diff
import typings.momentDashRange.Anon_Adjacent
import typings.momentDashRange.Anon_Exclusive
import typings.momentDashRange.Anon_ExclusiveStep
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-range", "DateRange")
@js.native
class DateRange protected () extends js.Object {
  def this(range: String) = this()
  def this(range: js.Array[Date | Moment]) = this()
  def this(start: Moment, end: Moment) = this()
  def this(start: Moment, end: Date) = this()
  def this(start: Date, end: Moment) = this()
  def this(start: Date, end: Date) = this()
  var end: Moment = js.native
  var start: Moment = js.native
  def add(other: DateRange): DateRange = js.native
  def add(other: DateRange, options: Anon_Adjacent): DateRange = js.native
  def adjacent(other: DateRange): Boolean = js.native
  def by(interval: Diff): Iterable[Moment] = js.native
  def by(interval: Diff, options: Anon_ExclusiveStep): Iterable[Moment] = js.native
  def byRange(interval: DateRange): Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: Anon_ExclusiveStep): Iterable[Moment] = js.native
  def center(): Moment = js.native
  def contains(other: Moment): Boolean = js.native
  def contains(other: Moment, options: Anon_Exclusive): Boolean = js.native
  def contains(other: DateRange): Boolean = js.native
  def contains(other: DateRange, options: Anon_Exclusive): Boolean = js.native
  def contains(other: Date): Boolean = js.native
  def contains(other: Date, options: Anon_Exclusive): Boolean = js.native
  def diff(): Double = js.native
  def diff(unit: Diff): Double = js.native
  def diff(unit: Diff, rounded: Boolean): Double = js.native
  def duration(): Double = js.native
  def duration(unit: Diff): Double = js.native
  def duration(unit: Diff, precise: Boolean): Double = js.native
  def intersect(other: DateRange): DateRange = js.native
  def isEqual(other: DateRange): Boolean = js.native
  def isSame(other: DateRange): Boolean = js.native
  def overlaps(range: DateRange): Boolean = js.native
  def overlaps(range: DateRange, options: Anon_Adjacent): Boolean = js.native
  def reverseBy(interval: Diff): Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: Anon_ExclusiveStep): Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange): Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: Anon_ExclusiveStep): Iterable[Moment] = js.native
  def subtract(other: DateRange): js.Array[DateRange] = js.native
  def toDate(): js.Array[Date] = js.native
}

