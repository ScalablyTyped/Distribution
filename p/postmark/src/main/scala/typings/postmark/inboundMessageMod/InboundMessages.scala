package typings.postmark.inboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessages extends js.Object {
  var InboundMessages: js.Array[InboundMessage]
  var TotalCount: String
}

object InboundMessages {
  @scala.inline
  def apply(InboundMessages: js.Array[InboundMessage], TotalCount: String): InboundMessages = {
    val __obj = js.Dynamic.literal(InboundMessages = InboundMessages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InboundMessages]
  }
}

