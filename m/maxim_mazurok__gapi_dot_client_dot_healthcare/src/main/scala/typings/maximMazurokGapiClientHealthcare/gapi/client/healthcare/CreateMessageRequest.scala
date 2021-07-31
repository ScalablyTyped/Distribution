package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMessageRequest extends StObject {
  
  /** HL7v2 message. */
  var message: js.UndefOr[Message] = js.undefined
}
object CreateMessageRequest {
  
  @scala.inline
  def apply(): CreateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMessageRequest]
  }
  
  @scala.inline
  implicit class CreateMessageRequestMutableBuilder[Self <: CreateMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
