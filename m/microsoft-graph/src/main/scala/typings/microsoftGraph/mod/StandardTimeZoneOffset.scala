package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardTimeZoneOffset extends StObject {
  
  // Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
  var dayOccurrence: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Represents the day of the week when the transition from daylight saving time to standard time.
  var dayOfWeek: js.UndefOr[NullableOption[DayOfWeek]] = js.undefined
  
  // Represents the month of the year when the transition from daylight saving time to standard time occurs.
  var month: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Represents the time of day when the transition from daylight saving time to standard time occurs.
  var time: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example,
    * a value of 0 means every year.
    */
  var year: js.UndefOr[NullableOption[Double]] = js.undefined
}
object StandardTimeZoneOffset {
  
  inline def apply(): StandardTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardTimeZoneOffset]
  }
  
  extension [Self <: StandardTimeZoneOffset](x: Self) {
    
    inline def setDayOccurrence(value: NullableOption[Double]): Self = StObject.set(x, "dayOccurrence", value.asInstanceOf[js.Any])
    
    inline def setDayOccurrenceNull: Self = StObject.set(x, "dayOccurrence", null)
    
    inline def setDayOccurrenceUndefined: Self = StObject.set(x, "dayOccurrence", js.undefined)
    
    inline def setDayOfWeek(value: NullableOption[DayOfWeek]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setMonth(value: NullableOption[Double]): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthNull: Self = StObject.set(x, "month", null)
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setTime(value: NullableOption[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setYear(value: NullableOption[Double]): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearNull: Self = StObject.set(x, "year", null)
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
