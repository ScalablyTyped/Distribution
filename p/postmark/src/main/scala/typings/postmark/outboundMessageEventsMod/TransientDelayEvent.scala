package typings.postmark.outboundMessageEventsMod

import typings.postmark.anon.DeliveryMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientDelayEvent extends MessageEvent {
  @JSName("Details")
  var Details_TransientDelayEvent: DeliveryMessage
}

object TransientDelayEvent {
  @scala.inline
  def apply(Details: DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): TransientDelayEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientDelayEvent]
  }
}

