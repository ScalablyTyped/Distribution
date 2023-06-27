package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantIdentitySyncPolicyPartner extends StObject {
  
  /**
    * Display name for the cross-tenant user synchronization policy. Use the name of the partner Azure AD (Azure Active
    * Directory) tenant to easily identify the policy. Optional.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Tenant identifier for the partner Azure AD organization. Read-only.
  var tenantId: js.UndefOr[String] = js.undefined
  
  // Defines whether users can be synchronized from the partner tenant. Key.
  var userSyncInbound: js.UndefOr[NullableOption[CrossTenantUserSyncInbound]] = js.undefined
}
object CrossTenantIdentitySyncPolicyPartner {
  
  inline def apply(): CrossTenantIdentitySyncPolicyPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantIdentitySyncPolicyPartner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantIdentitySyncPolicyPartner] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setUserSyncInbound(value: NullableOption[CrossTenantUserSyncInbound]): Self = StObject.set(x, "userSyncInbound", value.asInstanceOf[js.Any])
    
    inline def setUserSyncInboundNull: Self = StObject.set(x, "userSyncInbound", null)
    
    inline def setUserSyncInboundUndefined: Self = StObject.set(x, "userSyncInbound", js.undefined)
  }
}
