package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadUserConversationMember
  extends StObject
     with ConversationMember {
  
  // The email address of the user.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // TenantId which the Azure AD user belongs to.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var user: js.UndefOr[NullableOption[User]] = js.undefined
  
  // The guid of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AadUserConversationMember {
  
  inline def apply(): AadUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AadUserConversationMember]
  }
  
  extension [Self <: AadUserConversationMember](x: Self) {
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setUser(value: NullableOption[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
