package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationMember
  extends StObject
     with Entity {
  
  // The display name of the user.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The roles for that user.
  var roles: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object ConversationMember {
  
  @scala.inline
  def apply(): ConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationMember]
  }
  
  @scala.inline
  implicit class ConversationMemberMutableBuilder[Self <: ConversationMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesNull: Self = StObject.set(x, "roles", null)
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
