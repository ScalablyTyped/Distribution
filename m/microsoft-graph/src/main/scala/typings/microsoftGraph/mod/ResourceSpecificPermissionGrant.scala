package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSpecificPermissionGrant
  extends StObject
     with DirectoryObject {
  
  var clientAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var clientId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var permission: js.UndefOr[NullableOption[String]] = js.undefined
  
  var permissionType: js.UndefOr[NullableOption[String]] = js.undefined
  
  var resourceAppId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceSpecificPermissionGrant {
  
  inline def apply(): ResourceSpecificPermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpecificPermissionGrant]
  }
  
  extension [Self <: ResourceSpecificPermissionGrant](x: Self) {
    
    inline def setClientAppId(value: NullableOption[String]): Self = StObject.set(x, "clientAppId", value.asInstanceOf[js.Any])
    
    inline def setClientAppIdNull: Self = StObject.set(x, "clientAppId", null)
    
    inline def setClientAppIdUndefined: Self = StObject.set(x, "clientAppId", js.undefined)
    
    inline def setClientId(value: NullableOption[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setPermission(value: NullableOption[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionType(value: NullableOption[String]): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeNull: Self = StObject.set(x, "permissionType", null)
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setResourceAppId(value: NullableOption[String]): Self = StObject.set(x, "resourceAppId", value.asInstanceOf[js.Any])
    
    inline def setResourceAppIdNull: Self = StObject.set(x, "resourceAppId", null)
    
    inline def setResourceAppIdUndefined: Self = StObject.set(x, "resourceAppId", js.undefined)
  }
}
