package typings.postmark.distClientModelsMessagesOutboundMessageEventsMod

import typings.postmark.Anon_BounceID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceEvent extends MessageEvent {
  @JSName("Details")
  var Details_BounceEvent: Anon_BounceID
}

object BounceEvent {
  @scala.inline
  def apply(Details: Anon_BounceID, ReceivedAt: String, Recipient: String, Type: String): BounceEvent = {
    val __obj = js.Dynamic.literal(Details = Details, ReceivedAt = ReceivedAt, Recipient = Recipient, Type = Type)
  
    __obj.asInstanceOf[BounceEvent]
  }
}

