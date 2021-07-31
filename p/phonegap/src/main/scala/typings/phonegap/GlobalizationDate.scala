package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationDate extends StObject {
  
  var day: Double
  
  var hour: Double
  
  var millisecond: Double
  
  var minute: Double
  
  var month: Double
  
  var second: Double
  
  var year: Double
}
object GlobalizationDate {
  
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    millisecond: Double,
    minute: Double,
    month: Double,
    second: Double,
    year: Double
  ): GlobalizationDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationDate]
  }
  
  @scala.inline
  implicit class GlobalizationDateMutableBuilder[Self <: GlobalizationDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
