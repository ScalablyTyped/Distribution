package typings.momentRange.mod

import typings.moment.mod.Moment
import typings.moment.mod.unitOfTime.Diff
import typings.momentRange.AnonAdjacent
import typings.momentRange.AnonExcludeEnd
import typings.momentRange.AnonExcludeEndExcludeStart
import typings.momentRange.AnonExcludeStart
import typings.momentRange.AnonExclusive
import typings.momentRange.AnonExclusiveBoolean
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-range", "DateRange")
@js.native
class DateRange () extends js.Object {
  def this(range: String) = this()
  def this(range: js.Tuple2[Date | Moment, Date | Moment]) = this()
  def this(start: Moment, end: Moment) = this()
  def this(start: Moment, end: Date) = this()
  def this(start: Date, end: Moment) = this()
  def this(start: Date, end: Date) = this()
  var end: Moment = js.native
  var start: Moment = js.native
  def add(other: DateRange): DateRange | Null = js.native
  def add(other: DateRange, options: AnonAdjacent): DateRange | Null = js.native
  def adjacent(other: DateRange): Boolean = js.native
  def by(interval: Diff): Iterable[Moment] = js.native
  def by(interval: Diff, options: AnonExcludeEnd): Iterable[Moment] = js.native
  def by(interval: Diff, options: AnonExclusive): Iterable[Moment] = js.native
  def byRange(interval: DateRange): Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: AnonExcludeEnd): Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: AnonExclusive): Iterable[Moment] = js.native
  def center(): Moment = js.native
  def contains(other: Moment): Boolean = js.native
  def contains(other: Moment, options: AnonExcludeEndExcludeStart): Boolean = js.native
  def contains(other: Moment, options: AnonExclusiveBoolean): Boolean = js.native
  def contains(other: DateRange): Boolean = js.native
  def contains(other: DateRange, options: AnonExcludeEndExcludeStart): Boolean = js.native
  def contains(other: DateRange, options: AnonExclusiveBoolean): Boolean = js.native
  def contains(other: Date): Boolean = js.native
  def contains(other: Date, options: AnonExcludeEndExcludeStart): Boolean = js.native
  def contains(other: Date, options: AnonExclusiveBoolean): Boolean = js.native
  def diff(): Double = js.native
  def diff(unit: Diff): Double = js.native
  def diff(unit: Diff, precise: Boolean): Double = js.native
  def duration(): Double = js.native
  def duration(unit: Diff): Double = js.native
  def duration(unit: Diff, precise: Boolean): Double = js.native
  def intersect(other: DateRange): DateRange | Null = js.native
  def isEqual(other: DateRange): Boolean = js.native
  def isSame(other: DateRange): Boolean = js.native
  def overlaps(other: DateRange): Boolean = js.native
  def overlaps(other: DateRange, options: AnonAdjacent): Boolean = js.native
  def reverseBy(interval: Diff): Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: AnonExcludeStart): Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: AnonExclusive): Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange): Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: AnonExcludeStart): Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: AnonExclusive): Iterable[Moment] = js.native
  def snapTo(interval: Diff): DateRange = js.native
  def subtract(other: DateRange): js.Array[DateRange] = js.native
  def toDate(): js.Tuple2[Date, Date] = js.native
}

