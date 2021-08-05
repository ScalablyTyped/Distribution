package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`idle-state-changed`
import typings.openfin.openfinStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleStateChangedEvent extends StObject {
  
  /**
    * How long in milliseconds since the user has been idle.
    */
  var elapsedTime: Double
  
  /**
    * true when the user is idle,false when the user has returned;
    */
  var isIdle: Boolean
  
  var topic: system
  
  var `type`: `idle-state-changed`
}
object IdleStateChangedEvent {
  
  inline def apply(elapsedTime: Double, isIdle: Boolean): IdleStateChangedEvent = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = "system")
    __obj.updateDynamic("type")("idle-state-changed")
    __obj.asInstanceOf[IdleStateChangedEvent]
  }
  
  extension [Self <: IdleStateChangedEvent](x: Self) {
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setIsIdle(value: Boolean): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: `idle-state-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
