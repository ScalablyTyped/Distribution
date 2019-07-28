package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessagesResult extends PaginatedResult {
  var Messages: js.Array[OutboundMessageBase]
}

object OutboundMessagesResult {
  @scala.inline
  def apply(Messages: js.Array[OutboundMessageBase], TotalCount: Double): OutboundMessagesResult = {
    val __obj = js.Dynamic.literal(Messages = Messages, TotalCount = TotalCount)
  
    __obj.asInstanceOf[OutboundMessagesResult]
  }
}

