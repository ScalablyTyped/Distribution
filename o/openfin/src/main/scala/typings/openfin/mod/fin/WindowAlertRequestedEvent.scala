package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowAlertRequestedEvent
  extends StObject
     with WindowEvent {
  
  var message: String
  
  var url: String
}
object WindowAlertRequestedEvent {
  
  @scala.inline
  def apply(
    message: String,
    name: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    url: String,
    uuid: String
  ): WindowAlertRequestedEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAlertRequestedEvent]
  }
  
  @scala.inline
  implicit class WindowAlertRequestedEventMutableBuilder[Self <: WindowAlertRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
