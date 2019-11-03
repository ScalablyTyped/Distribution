package typings.postmark.distClientModelsMessagesOutboundMessageEventsMod

import typings.postmark.Anon_DeliveryMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientDelayEvent extends MessageEvent {
  @JSName("Details")
  var Details_TransientDelayEvent: Anon_DeliveryMessage
}

object TransientDelayEvent {
  @scala.inline
  def apply(Details: Anon_DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): TransientDelayEvent = {
    val __obj = js.Dynamic.literal(Details = Details, ReceivedAt = ReceivedAt, Recipient = Recipient, Type = Type)
  
    __obj.asInstanceOf[TransientDelayEvent]
  }
}

