package typings.postmark.outboundMessageEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent extends js.Object {
  var Details: js.Object = js.native
  var ReceivedAt: String = js.native
  var Recipient: String = js.native
  var Type: String = js.native
}

object MessageEvent {
  @scala.inline
  def apply(Details: js.Object, ReceivedAt: String, Recipient: String, Type: String): MessageEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  implicit class MessageEventOps[Self <: MessageEvent] (val x: Self) extends AnyVal {
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
    def setDetails(value: js.Object): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedAt(value: String): Self = this.set("ReceivedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: String): Self = this.set("Recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

