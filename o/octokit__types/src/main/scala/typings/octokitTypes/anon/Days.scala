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
  
  inline def apply(days: js.Array[Double], total: Double, week: Double): Days = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  
  extension [Self <: Days](x: Self) {
    
    inline def setDays(value: js.Array[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: Double*): Self = StObject.set(x, "days", js.Array(value :_*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
  }
}
