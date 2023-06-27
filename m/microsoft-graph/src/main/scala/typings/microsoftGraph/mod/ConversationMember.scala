package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationMember
  extends StObject
     with Entity {
  
  // The display name of the user.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The roles for that user. This property contains additional qualifiers only when relevant - for example, if the member
    * has owner privileges, the roles property contains owner as one of the values. Similarly, if the member is an in-tenant
    * guest, the roles property contains guest as one of the values. A basic member should not have any values specified in
    * the roles property. An Out-of-tenant external member is assigned the owner role.
    */
  var roles: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The timestamp denoting how far back a conversation's history is shared with the conversation member. This property is
    * settable only for members of a chat.
    */
  var visibleHistoryStartDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object ConversationMember {
  
  inline def apply(): ConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversationMember] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesNull: Self = StObject.set(x, "roles", null)
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setVisibleHistoryStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "visibleHistoryStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setVisibleHistoryStartDateTimeNull: Self = StObject.set(x, "visibleHistoryStartDateTime", null)
    
    inline def setVisibleHistoryStartDateTimeUndefined: Self = StObject.set(x, "visibleHistoryStartDateTime", js.undefined)
  }
}
