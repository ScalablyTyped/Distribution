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
  
  @scala.inline
  def apply(): SendMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageRequest]
  }
  
  @scala.inline
  implicit class SendMessageRequestMutableBuilder[Self <: SendMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
