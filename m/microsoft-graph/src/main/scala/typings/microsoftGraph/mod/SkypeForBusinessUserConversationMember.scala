package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkypeForBusinessUserConversationMember
  extends StObject
     with ConversationMember {
  
  // ID of the tenant that the user belongs to.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Azure Active Directory ID of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SkypeForBusinessUserConversationMember {
  
  inline def apply(): SkypeForBusinessUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkypeForBusinessUserConversationMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkypeForBusinessUserConversationMember] (val x: Self) extends AnyVal {
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
