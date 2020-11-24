package typings.postmark.inboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InboundMessages extends js.Object {
  
  var InboundMessages: js.Array[InboundMessage] = js.native
  
  var TotalCount: String = js.native
}
object InboundMessages {
  
  @scala.inline
  def apply(InboundMessages: js.Array[InboundMessage], TotalCount: String): InboundMessages = {
    val __obj = js.Dynamic.literal(InboundMessages = InboundMessages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessages]
  }
  
  @scala.inline
  implicit class InboundMessagesOps[Self <: InboundMessages] (val x: Self) extends AnyVal {
    
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
    def setInboundMessagesVarargs(value: InboundMessage*): Self = this.set("InboundMessages", js.Array(value :_*))
    
    @scala.inline
    def setInboundMessages(value: js.Array[InboundMessage]): Self = this.set("InboundMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: String): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
}
