package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AadUserConversationMember extends ConversationMember {
  
  // The email address of the user.
  var email: js.UndefOr[NullableOption[String]] = js.native
  
  var user: js.UndefOr[NullableOption[User]] = js.native
  
  // The guid of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.native
}
object AadUserConversationMember {
  
  @scala.inline
  def apply(): AadUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AadUserConversationMember]
  }
  
  @scala.inline
  implicit class AadUserConversationMemberOps[Self <: AadUserConversationMember] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: NullableOption[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    
    @scala.inline
    def setUser(value: NullableOption[User]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
  }
}
