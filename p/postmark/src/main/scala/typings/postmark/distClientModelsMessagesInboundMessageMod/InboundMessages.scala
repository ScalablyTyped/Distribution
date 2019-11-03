package typings.postmark.distClientModelsMessagesInboundMessageMod

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
    val __obj = js.Dynamic.literal(InboundMessages = InboundMessages, TotalCount = TotalCount)
  
    __obj.asInstanceOf[InboundMessages]
  }
}

