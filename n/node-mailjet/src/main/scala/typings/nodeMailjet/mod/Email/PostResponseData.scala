package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostResponseData extends js.Object {
  
  val Messages: js.Array[PostResponseDataMessage] = js.native
}
object PostResponseData {
  
  @scala.inline
  def apply(Messages: js.Array[PostResponseDataMessage]): PostResponseData = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseData]
  }
  
  @scala.inline
  implicit class PostResponseDataOps[Self <: PostResponseData] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: PostResponseDataMessage*): Self = this.set("Messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[PostResponseDataMessage]): Self = this.set("Messages", value.asInstanceOf[js.Any])
  }
}
