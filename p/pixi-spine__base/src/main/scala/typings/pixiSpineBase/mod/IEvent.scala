package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent extends StObject {
  
  var data: IEventData
  
  var time: Double
}
object IEvent {
  
  inline def apply(data: IEventData, time: Double): IEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  
  extension [Self <: IEvent](x: Self) {
    
    inline def setData(value: IEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
