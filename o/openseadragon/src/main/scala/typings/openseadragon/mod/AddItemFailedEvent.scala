package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItemFailedEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var message: String
  
  var options: js.Object
  
  var source: String
}
object AddItemFailedEvent {
  
  inline def apply(eventSource: Viewer, message: String, options: js.Object, source: String, userData: Any): AddItemFailedEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemFailedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddItemFailedEvent] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
