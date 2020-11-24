package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceReply extends js.Object {
  
  var force_reply: Boolean = js.native
  
  var selective: js.UndefOr[Boolean] = js.native
}
object ForceReply {
  
  @scala.inline
  def apply(force_reply: Boolean): ForceReply = {
    val __obj = js.Dynamic.literal(force_reply = force_reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceReply]
  }
  
  @scala.inline
  implicit class ForceReplyOps[Self <: ForceReply] (val x: Self) extends AnyVal {
    
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
    def setForce_reply(value: Boolean): Self = this.set("force_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelective(value: Boolean): Self = this.set("selective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelective: Self = this.set("selective", js.undefined)
  }
}
