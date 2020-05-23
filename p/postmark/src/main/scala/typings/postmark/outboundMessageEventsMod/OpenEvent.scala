package typings.postmark.outboundMessageEventsMod

import typings.postmark.anon.Summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEvent extends MessageEvent {
  @JSName("Details")
  var Details_OpenEvent: Summary
}

object OpenEvent {
  @scala.inline
  def apply(Details: Summary, ReceivedAt: String, Recipient: String, Type: String): OpenEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenEvent]
  }
}

