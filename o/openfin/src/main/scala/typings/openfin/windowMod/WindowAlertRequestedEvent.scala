package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowAlertRequestedEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var message: String
  
  var url: String
}
object WindowAlertRequestedEvent {
  
  inline def apply[Topic, Type](message: String, name: String, topic: Topic, `type`: Type, url: String, uuid: String): WindowAlertRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAlertRequestedEvent[Topic, Type]]
  }
  
  extension [Self <: WindowAlertRequestedEvent[?, ?], Topic, Type](x: Self & (WindowAlertRequestedEvent[Topic, Type])) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
