package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessageReaction extends js.Object {
  
  var createdDateTime: js.UndefOr[String] = js.native
  
  var reactionType: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[IdentitySet] = js.native
}
object ChatMessageReaction {
  
  @scala.inline
  def apply(): ChatMessageReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageReaction]
  }
  
  @scala.inline
  implicit class ChatMessageReactionOps[Self <: ChatMessageReaction] (val x: Self) extends AnyVal {
    
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
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setReactionType(value: String): Self = this.set("reactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactionType: Self = this.set("reactionType", js.undefined)
    
    @scala.inline
    def setUser(value: IdentitySet): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
