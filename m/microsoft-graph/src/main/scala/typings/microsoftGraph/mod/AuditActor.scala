package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditActor extends StObject {
  
  // Name of the Application.
  var applicationDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // AAD Application Id.
  var applicationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Actor Type.
  var auditActorType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // IPAddress.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Service Principal Name (SPN).
  var servicePrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User Id.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of user permissions when the audit was performed.
  var userPermissions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // User Principal Name (UPN).
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object AuditActor {
  
  inline def apply(): AuditActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditActor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditActor] (val x: Self) extends AnyVal {
    
    inline def setApplicationDisplayName(value: NullableOption[String]): Self = StObject.set(x, "applicationDisplayName", value.asInstanceOf[js.Any])
    
    inline def setApplicationDisplayNameNull: Self = StObject.set(x, "applicationDisplayName", null)
    
    inline def setApplicationDisplayNameUndefined: Self = StObject.set(x, "applicationDisplayName", js.undefined)
    
    inline def setApplicationId(value: NullableOption[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdNull: Self = StObject.set(x, "applicationId", null)
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setAuditActorType(value: NullableOption[String]): Self = StObject.set(x, "auditActorType", value.asInstanceOf[js.Any])
    
    inline def setAuditActorTypeNull: Self = StObject.set(x, "auditActorType", null)
    
    inline def setAuditActorTypeUndefined: Self = StObject.set(x, "auditActorType", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setServicePrincipalName(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalName", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalNameNull: Self = StObject.set(x, "servicePrincipalName", null)
    
    inline def setServicePrincipalNameUndefined: Self = StObject.set(x, "servicePrincipalName", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserPermissions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
    
    inline def setUserPermissionsNull: Self = StObject.set(x, "userPermissions", null)
    
    inline def setUserPermissionsUndefined: Self = StObject.set(x, "userPermissions", js.undefined)
    
    inline def setUserPermissionsVarargs(value: String*): Self = StObject.set(x, "userPermissions", js.Array(value*))
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
