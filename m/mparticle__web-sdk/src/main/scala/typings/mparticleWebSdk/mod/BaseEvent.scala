package typings.mparticleWebSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEvent extends StObject {
  
  var data: Record[String, Any]
  
  var eventType: Double
  
  var messageType: Double
  
  var name: String
  
  var toEventAPIObject: js.UndefOr[js.Function0[Any]] = js.undefined
}
object BaseEvent {
  
  inline def apply(data: Record[String, Any], eventType: Double, messageType: Double, name: String): BaseEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
  
  extension [Self <: BaseEvent](x: Self) {
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: Double): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setToEventAPIObject(value: () => Any): Self = StObject.set(x, "toEventAPIObject", js.Any.fromFunction0(value))
    
    inline def setToEventAPIObjectUndefined: Self = StObject.set(x, "toEventAPIObject", js.undefined)
  }
}
