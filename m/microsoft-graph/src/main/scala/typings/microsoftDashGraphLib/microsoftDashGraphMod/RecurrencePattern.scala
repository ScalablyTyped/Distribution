package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrencePattern extends js.Object {
  /** The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly. */
  var dayOfMonth: js.UndefOr[scala.Double] = js.undefined
  /**
    * A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday.
    * If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.
    * Required if type is weekly, relativeMonthly, or relativeYearly.
    */
  var daysOfWeek: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  /** The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly. */
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  /**
    * Specifies on which instance of the allowed days specified in daysOfsWeek the event occurs, counted from the first instance in the month.
    * The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
    */
  var index: js.UndefOr[WeekIndex] = js.undefined
  /** The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required. */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** The month in which the event occurs.  This is a number from 1 to 12. */
  var month: js.UndefOr[scala.Double] = js.undefined
  /** The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required. */
  var `type`: js.UndefOr[RecurrencePatternType] = js.undefined
}

object RecurrencePattern {
  @scala.inline
  def apply(
    dayOfMonth: scala.Int | scala.Double = null,
    daysOfWeek: js.Array[DayOfWeek] = null,
    firstDayOfWeek: DayOfWeek = null,
    index: WeekIndex = null,
    interval: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    `type`: RecurrencePatternType = null
  ): RecurrencePattern = {
    val __obj = js.Dynamic.literal()
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth.asInstanceOf[js.Any])
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    if (index != null) __obj.updateDynamic("index")(index)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecurrencePattern]
  }
}

