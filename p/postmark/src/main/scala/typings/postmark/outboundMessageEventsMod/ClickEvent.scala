package typings.postmark.outboundMessageEventsMod

import typings.postmark.AnonClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvent extends MessageEvent {
  @JSName("Details")
  var Details_ClickEvent: AnonClickLocation
}

object ClickEvent {
  @scala.inline
  def apply(Details: AnonClickLocation, ReceivedAt: String, Recipient: String, Type: String): ClickEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickEvent]
  }
}

