package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemBaseEvent extends StObject {
  
  var topic: String
  
  var `type`: OpenFinSystemEventType
  
  var uuid: String
}
object SystemBaseEvent {
  
  inline def apply(topic: String, `type`: OpenFinSystemEventType, uuid: String): SystemBaseEvent = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemBaseEvent]
  }
  
  extension [Self <: SystemBaseEvent](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpenFinSystemEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
