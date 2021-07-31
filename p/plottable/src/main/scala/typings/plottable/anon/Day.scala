package typings.plottable.anon

import typings.plottable.plottableStrings.day
import typings.plottable.plottableStrings.hour
import typings.plottable.plottableStrings.minute
import typings.plottable.plottableStrings.month
import typings.plottable.plottableStrings.second
import typings.plottable.plottableStrings.week
import typings.plottable.plottableStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  var day: typings.plottable.plottableStrings.day
  
  var hour: typings.plottable.plottableStrings.hour
  
  var minute: typings.plottable.plottableStrings.minute
  
  var month: typings.plottable.plottableStrings.month
  
  var second: typings.plottable.plottableStrings.second
  
  var week: typings.plottable.plottableStrings.week
  
  var year: typings.plottable.plottableStrings.year
}
object Day {
  
  @scala.inline
  def apply(): Day = {
    val __obj = js.Dynamic.literal(day = "day", hour = "hour", minute = "minute", month = "month", second = "second", week = "week", year = "year")
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit class DayMutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: day): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: hour): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: minute): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: month): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: second): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: week): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: year): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
