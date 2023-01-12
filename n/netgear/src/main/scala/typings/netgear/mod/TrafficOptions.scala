package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficOptions extends StObject {
  
  var newControlOption: String
  
  var newNewMonthlyLimit: Double
  
  var restartDay: Double
  
  var restartHour: Double
  
  var restartMinute: Double
}
object TrafficOptions {
  
  inline def apply(
    newControlOption: String,
    newNewMonthlyLimit: Double,
    restartDay: Double,
    restartHour: Double,
    restartMinute: Double
  ): TrafficOptions = {
    val __obj = js.Dynamic.literal(newControlOption = newControlOption.asInstanceOf[js.Any], newNewMonthlyLimit = newNewMonthlyLimit.asInstanceOf[js.Any], restartDay = restartDay.asInstanceOf[js.Any], restartHour = restartHour.asInstanceOf[js.Any], restartMinute = restartMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficOptions] (val x: Self) extends AnyVal {
    
    inline def setNewControlOption(value: String): Self = StObject.set(x, "newControlOption", value.asInstanceOf[js.Any])
    
    inline def setNewNewMonthlyLimit(value: Double): Self = StObject.set(x, "newNewMonthlyLimit", value.asInstanceOf[js.Any])
    
    inline def setRestartDay(value: Double): Self = StObject.set(x, "restartDay", value.asInstanceOf[js.Any])
    
    inline def setRestartHour(value: Double): Self = StObject.set(x, "restartHour", value.asInstanceOf[js.Any])
    
    inline def setRestartMinute(value: Double): Self = StObject.set(x, "restartMinute", value.asInstanceOf[js.Any])
  }
}
