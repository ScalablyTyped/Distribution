package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDailyTrigger extends StObject {
  
  var DaysInterval: Double
}
object IDailyTrigger {
  
  inline def apply(DaysInterval: Double): IDailyTrigger = {
    val __obj = js.Dynamic.literal(DaysInterval = DaysInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDailyTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDailyTrigger] (val x: Self) extends AnyVal {
    
    inline def setDaysInterval(value: Double): Self = StObject.set(x, "DaysInterval", value.asInstanceOf[js.Any])
  }
}
