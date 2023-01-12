package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerMessage extends StObject {
  
  var payload: Any
  
  var src: String
  
  var `type`: ServerMessageType
}
object ServerMessage {
  
  inline def apply(payload: Any, src: String, `type`: ServerMessageType): ServerMessage = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerMessage] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setType(value: ServerMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
