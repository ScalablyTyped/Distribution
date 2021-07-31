package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestMessageResponse extends StObject {
  
  /** HL7v2 ACK message. */
  var hl7Ack: js.UndefOr[String] = js.undefined
  
  /** Created message resource. */
  var message: js.UndefOr[Message] = js.undefined
}
object IngestMessageResponse {
  
  @scala.inline
  def apply(): IngestMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestMessageResponse]
  }
  
  @scala.inline
  implicit class IngestMessageResponseMutableBuilder[Self <: IngestMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHl7Ack(value: String): Self = StObject.set(x, "hl7Ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHl7AckUndefined: Self = StObject.set(x, "hl7Ack", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
