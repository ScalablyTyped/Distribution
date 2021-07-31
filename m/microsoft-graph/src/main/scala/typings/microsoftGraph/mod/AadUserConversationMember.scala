package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadUserConversationMember
  extends StObject
     with ConversationMember {
  
  // The email address of the user.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  var user: js.UndefOr[NullableOption[User]] = js.undefined
  
  // The guid of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AadUserConversationMember {
  
  @scala.inline
  def apply(): AadUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AadUserConversationMember]
  }
  
  @scala.inline
  implicit class AadUserConversationMemberMutableBuilder[Self <: AadUserConversationMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setUser(value: NullableOption[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
