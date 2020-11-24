package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrencePattern extends js.Object {
  
  // The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
  var dayOfMonth: js.UndefOr[Double] = js.native
  
  /**
    * A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday,
    * wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than
    * one day, the event falls on the first day that satisfies the pattern. Required if type is weekly, relativeMonthly, or
    * relativeYearly.
    */
  var daysOfWeek: js.UndefOr[NullableOption[js.Array[DayOfWeek]]] = js.native
  
  /**
    * The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday.
    * Default is sunday. Required if type is weekly.
    */
  var firstDayOfWeek: js.UndefOr[NullableOption[DayOfWeek]] = js.native
  
  /**
    * Specifies on which instance of the allowed days specified in daysOfsWeek the event occurs, counted from the first
    * instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used
    * if type is relativeMonthly or relativeYearly.
    */
  var index: js.UndefOr[NullableOption[WeekIndex]] = js.native
  
  /**
    * The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type.
    * Required.
    */
  var interval: js.UndefOr[Double] = js.native
  
  // The month in which the event occurs. This is a number from 1 to 12.
  var month: js.UndefOr[Double] = js.native
  
  // The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required.
  var `type`: js.UndefOr[NullableOption[RecurrencePatternType]] = js.native
}
object RecurrencePattern {
  
  @scala.inline
  def apply(): RecurrencePattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrencePattern]
  }
  
  @scala.inline
  implicit class RecurrencePatternOps[Self <: RecurrencePattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDayOfMonth(value: Double): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: DayOfWeek*): Self = this.set("daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: NullableOption[js.Array[DayOfWeek]]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    
    @scala.inline
    def setDaysOfWeekNull: Self = this.set("daysOfWeek", null)
    
    @scala.inline
    def setFirstDayOfWeek(value: NullableOption[DayOfWeek]): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeekNull: Self = this.set("firstDayOfWeek", null)
    
    @scala.inline
    def setIndex(value: NullableOption[WeekIndex]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIndexNull: Self = this.set("index", null)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[RecurrencePatternType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
