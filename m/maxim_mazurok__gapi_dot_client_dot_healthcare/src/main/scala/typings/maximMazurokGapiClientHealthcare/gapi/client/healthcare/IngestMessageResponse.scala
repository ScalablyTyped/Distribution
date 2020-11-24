package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestMessageResponse extends js.Object {
  
  /** HL7v2 ACK message. */
  var hl7Ack: js.UndefOr[String] = js.native
  
  /** Created message resource. */
  var message: js.UndefOr[Message] = js.native
}
object IngestMessageResponse {
  
  @scala.inline
  def apply(): IngestMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestMessageResponse]
  }
  
  @scala.inline
  implicit class IngestMessageResponseOps[Self <: IngestMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHl7Ack(value: String): Self = this.set("hl7Ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl7Ack: Self = this.set("hl7Ack", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
