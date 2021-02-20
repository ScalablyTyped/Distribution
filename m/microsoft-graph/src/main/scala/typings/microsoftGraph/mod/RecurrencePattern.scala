package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrencePattern extends StObject {
  
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
  implicit class RecurrencePatternMutableBuilder[Self <: RecurrencePattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    @scala.inline
    def setDaysOfWeek(value: NullableOption[js.Array[DayOfWeek]]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekNull: Self = StObject.set(x, "daysOfWeek", null)
    
    @scala.inline
    def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: DayOfWeek*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setFirstDayOfWeek(value: NullableOption[DayOfWeek]): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeekNull: Self = StObject.set(x, "firstDayOfWeek", null)
    
    @scala.inline
    def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setIndex(value: NullableOption[WeekIndex]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNull: Self = StObject.set(x, "index", null)
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[RecurrencePatternType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
