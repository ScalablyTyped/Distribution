package typings.postmark.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStreams extends js.Object {
  
  var MessageStreams: js.Array[MessageStream] = js.native
  
  var TotalCount: Double = js.native
}
object MessageStreams {
  
  @scala.inline
  def apply(MessageStreams: js.Array[MessageStream], TotalCount: Double): MessageStreams = {
    val __obj = js.Dynamic.literal(MessageStreams = MessageStreams.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStreams]
  }
  
  @scala.inline
  implicit class MessageStreamsOps[Self <: MessageStreams] (val x: Self) extends AnyVal {
    
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
    def setMessageStreamsVarargs(value: MessageStream*): Self = this.set("MessageStreams", js.Array(value :_*))
    
    @scala.inline
    def setMessageStreams(value: js.Array[MessageStream]): Self = this.set("MessageStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
}
