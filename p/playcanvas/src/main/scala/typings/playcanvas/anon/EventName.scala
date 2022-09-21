package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventName extends StObject {
  
  var callback: Any
  
  var eventName: String
  
  var id: String
  
  var scope: Any
  
  var sourceName: String
}
object EventName {
  
  inline def apply(callback: Any, eventName: String, id: String, scope: Any, sourceName: String): EventName = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
  
  extension [Self <: EventName](x: Self) {
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
  }
}
