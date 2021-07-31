package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days extends StObject {
  
  var days: js.Array[Double]
  
  var total: Double
  
  var week: Double
}
object Days {
  
  @scala.inline
  def apply(days: js.Array[Double], total: Double, week: Double): Days = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  
  @scala.inline
  implicit class DaysMutableBuilder[Self <: Days] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: js.Array[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysVarargs(value: Double*): Self = StObject.set(x, "days", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
  }
}
