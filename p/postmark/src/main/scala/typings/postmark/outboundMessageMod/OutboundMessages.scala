package typings.postmark.outboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessages extends js.Object {
  var Messages: js.Array[OutboundMessage] = js.native
  var TotalCount: String = js.native
}

object OutboundMessages {
  @scala.inline
  def apply(Messages: js.Array[OutboundMessage], TotalCount: String): OutboundMessages = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessages]
  }
  @scala.inline
  implicit class OutboundMessagesOps[Self <: OutboundMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessagesVarargs(value: OutboundMessage*): Self = this.set("Messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[OutboundMessage]): Self = this.set("Messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: String): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
  
}

