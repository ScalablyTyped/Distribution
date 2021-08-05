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
  
  inline def apply(): ConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationMember]
  }
  
  extension [Self <: ConversationMember](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesNull: Self = StObject.set(x, "roles", null)
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
