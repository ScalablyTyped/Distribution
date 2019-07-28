package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessagesResult extends PaginatedResult {
  var InboundMessages: js.Array[InboundMessageBase]
}

object InboundMessagesResult {
  @scala.inline
  def apply(InboundMessages: js.Array[InboundMessageBase], TotalCount: Double): InboundMessagesResult = {
    val __obj = js.Dynamic.literal(InboundMessages = InboundMessages, TotalCount = TotalCount)
  
    __obj.asInstanceOf[InboundMessagesResult]
  }
}

