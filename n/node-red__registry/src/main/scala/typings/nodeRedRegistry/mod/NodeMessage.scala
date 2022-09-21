package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMessage extends StObject {
  
  var _msgid: js.UndefOr[String] = js.undefined
  
  var payload: js.UndefOr[Any] = js.undefined
  
  var topic: js.UndefOr[String] = js.undefined
}
object NodeMessage {
  
  inline def apply(): NodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeMessage]
  }
  
  extension [Self <: NodeMessage](x: Self) {
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def set_msgid(value: String): Self = StObject.set(x, "_msgid", value.asInstanceOf[js.Any])
    
    inline def set_msgidUndefined: Self = StObject.set(x, "_msgid", js.undefined)
  }
}
