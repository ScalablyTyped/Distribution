package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageRequest extends StObject {
  
  /** Required. Message to send. */
  var message: js.UndefOr[Message] = js.undefined
  
  /** Flag for testing the request without actually delivering the message. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object SendMessageRequest {
  
  inline def apply(): SendMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageRequest]
  }
  
  extension [Self <: SendMessageRequest](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
