package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`remote-connect`
import typings.openfin.openfinStrings.`remote-disconnect`
import typings.openfin.openfinStrings.`session-changed`
import typings.openfin.openfinStrings.lock
import typings.openfin.openfinStrings.system
import typings.openfin.openfinStrings.unknown
import typings.openfin.openfinStrings.unlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionChangedEvent extends StObject {
  
  /**
    * the action that triggered this event:
    */
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown
  
  var topic: system
  
  var `type`: `session-changed`
}
object SessionChangedEvent {
  
  inline def apply(reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown): SessionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = "system")
    __obj.updateDynamic("type")("session-changed")
    __obj.asInstanceOf[SessionChangedEvent]
  }
  
  extension [Self <: SessionChangedEvent](x: Self) {
    
    inline def setReason(value: lock | unlock | `remote-connect` | `remote-disconnect` | unknown): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: `session-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
