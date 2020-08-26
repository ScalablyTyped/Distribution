package typings.postmark.outboundMessageEventsMod

import typings.postmark.anon.DeliveryMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransientDelayEvent extends MessageEvent {
  @JSName("Details")
  var Details_TransientDelayEvent: DeliveryMessage = js.native
}

object TransientDelayEvent {
  @scala.inline
  def apply(Details: DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): TransientDelayEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientDelayEvent]
  }
  @scala.inline
  implicit class TransientDelayEventOps[Self <: TransientDelayEvent] (val x: Self) extends AnyVal {
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
    def setDetails(value: DeliveryMessage): Self = this.set("Details", value.asInstanceOf[js.Any])
  }
  
}

