package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurrencePattern extends StObject {
  
  // The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
  var dayOfMonth: js.UndefOr[Double] = js.undefined
  
  /**
    * A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday,
    * wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than
    * one day, the event falls on the first day that satisfies the pattern. Required if type is weekly, relativeMonthly, or
    * relativeYearly.
    */
  var daysOfWeek: js.UndefOr[NullableOption[js.Array[DayOfWeek]]] = js.undefined
  
  /**
    * The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday.
    * Default is sunday. Required if type is weekly.
    */
  var firstDayOfWeek: js.UndefOr[NullableOption[DayOfWeek]] = js.undefined
  
  /**
    * Specifies on which instance of the allowed days specified in daysOfWeek the event occurs, counted from the first
    * instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used
    * if type is relativeMonthly or relativeYearly.
    */
  var index: js.UndefOr[NullableOption[WeekIndex]] = js.undefined
  
  /**
    * The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type.
    * Required.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  // The month in which the event occurs. This is a number from 1 to 12.
  var month: js.UndefOr[Double] = js.undefined
  
  /**
    * The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required.
    * For more information, see values of type property.
    */
  var `type`: js.UndefOr[NullableOption[RecurrencePatternType]] = js.undefined
}
object RecurrencePattern {
  
  inline def apply(): RecurrencePattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrencePattern]
  }
  
  extension [Self <: RecurrencePattern](x: Self) {
    
    inline def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    inline def setDaysOfWeek(value: NullableOption[js.Array[DayOfWeek]]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekNull: Self = StObject.set(x, "daysOfWeek", null)
    
    inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    inline def setDaysOfWeekVarargs(value: DayOfWeek*): Self = StObject.set(x, "daysOfWeek", js.Array(value*))
    
    inline def setFirstDayOfWeek(value: NullableOption[DayOfWeek]): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekNull: Self = StObject.set(x, "firstDayOfWeek", null)
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setIndex(value: NullableOption[WeekIndex]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setType(value: NullableOption[RecurrencePatternType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
