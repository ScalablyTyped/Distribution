package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationMemberRoleUpdatedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Roles for the coversation member user.
  var conversationMemberRoles: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Identity of the conversation member user.
  var conversationMemberUser: js.UndefOr[NullableOption[TeamworkUserIdentity]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object ConversationMemberRoleUpdatedEventMessageDetail {
  
  inline def apply(): ConversationMemberRoleUpdatedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationMemberRoleUpdatedEventMessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversationMemberRoleUpdatedEventMessageDetail] (val x: Self) extends AnyVal {
    
    inline def setConversationMemberRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "conversationMemberRoles", value.asInstanceOf[js.Any])
    
    inline def setConversationMemberRolesNull: Self = StObject.set(x, "conversationMemberRoles", null)
    
    inline def setConversationMemberRolesUndefined: Self = StObject.set(x, "conversationMemberRoles", js.undefined)
    
    inline def setConversationMemberRolesVarargs(value: String*): Self = StObject.set(x, "conversationMemberRoles", js.Array(value*))
    
    inline def setConversationMemberUser(value: NullableOption[TeamworkUserIdentity]): Self = StObject.set(x, "conversationMemberUser", value.asInstanceOf[js.Any])
    
    inline def setConversationMemberUserNull: Self = StObject.set(x, "conversationMemberUser", null)
    
    inline def setConversationMemberUserUndefined: Self = StObject.set(x, "conversationMemberUser", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
