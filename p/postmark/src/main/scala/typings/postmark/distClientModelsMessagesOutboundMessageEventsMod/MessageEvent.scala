package typings.postmark.distClientModelsMessagesOutboundMessageEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  var Details: js.Object
  var ReceivedAt: String
  var Recipient: String
  var Type: String
}

object MessageEvent {
  @scala.inline
  def apply(Details: js.Object, ReceivedAt: String, Recipient: String, Type: String): MessageEvent = {
    val __obj = js.Dynamic.literal(Details = Details, ReceivedAt = ReceivedAt, Recipient = Recipient, Type = Type)
  
    __obj.asInstanceOf[MessageEvent]
  }
}

