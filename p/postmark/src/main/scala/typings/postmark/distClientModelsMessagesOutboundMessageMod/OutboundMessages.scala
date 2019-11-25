package typings.postmark.distClientModelsMessagesOutboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessages extends js.Object {
  var Messages: js.Array[OutboundMessage]
  var TotalCount: String
}

object OutboundMessages {
  @scala.inline
  def apply(Messages: js.Array[OutboundMessage], TotalCount: String): OutboundMessages = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutboundMessages]
  }
}

