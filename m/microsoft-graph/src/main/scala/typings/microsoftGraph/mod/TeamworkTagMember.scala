package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkTagMember
  extends StObject
     with Entity {
  
  // The member's display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the tenant that the tag member is a part of.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user ID of the member.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamworkTagMember {
  
  inline def apply(): TeamworkTagMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkTagMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamworkTagMember] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
