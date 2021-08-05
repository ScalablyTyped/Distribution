package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationBaseEvent extends StObject {
  
  var topic: String
  
  var `type`: OpenFinApplicationEventType
  
  var uuid: String
}
object ApplicationBaseEvent {
  
  inline def apply(topic: String, `type`: OpenFinApplicationEventType, uuid: String): ApplicationBaseEvent = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationBaseEvent]
  }
  
  extension [Self <: ApplicationBaseEvent](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpenFinApplicationEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
