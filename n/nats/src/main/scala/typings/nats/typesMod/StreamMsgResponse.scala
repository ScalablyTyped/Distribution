package typings.nats.typesMod

import typings.nats.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamMsgResponse
  extends StObject
     with ApiResponse {
  
  var message: Data
}
object StreamMsgResponse {
  
  inline def apply(message: Data, `type`: String): StreamMsgResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamMsgResponse]
  }
  
  extension [Self <: StreamMsgResponse](x: Self) {
    
    inline def setMessage(value: Data): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
