package typings.mongodbQueue.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueMessage extends js.Object {
  
  var ack: String = js.native
  
  var id: String = js.native
  
  var payload: Payload | ArrayPayload = js.native
  
  var tries: Double = js.native
}
object QueueMessage {
  
  @scala.inline
  def apply(ack: String, id: String, payload: Payload | ArrayPayload, tries: Double): QueueMessage = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tries = tries.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueMessage]
  }
  
  @scala.inline
  implicit class QueueMessageOps[Self <: QueueMessage] (val x: Self) extends AnyVal {
    
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
    def setAck(value: String): Self = this.set("ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadVarargs(value: (String | (Record[String, js.Any]))*): Self = this.set("payload", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: Payload | ArrayPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTries(value: Double): Self = this.set("tries", value.asInstanceOf[js.Any])
  }
}
