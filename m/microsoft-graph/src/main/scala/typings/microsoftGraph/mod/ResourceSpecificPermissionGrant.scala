package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSpecificPermissionGrant extends DirectoryObject {
  
  var clientAppId: js.UndefOr[NullableOption[String]] = js.native
  
  var clientId: js.UndefOr[NullableOption[String]] = js.native
  
  var permission: js.UndefOr[NullableOption[String]] = js.native
  
  var permissionType: js.UndefOr[NullableOption[String]] = js.native
  
  var resourceAppId: js.UndefOr[NullableOption[String]] = js.native
}
object ResourceSpecificPermissionGrant {
  
  @scala.inline
  def apply(): ResourceSpecificPermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpecificPermissionGrant]
  }
  
  @scala.inline
  implicit class ResourceSpecificPermissionGrantMutableBuilder[Self <: ResourceSpecificPermissionGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAppId(value: NullableOption[String]): Self = StObject.set(x, "clientAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAppIdNull: Self = StObject.set(x, "clientAppId", null)
    
    @scala.inline
    def setClientAppIdUndefined: Self = StObject.set(x, "clientAppId", js.undefined)
    
    @scala.inline
    def setClientId(value: NullableOption[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setPermission(value: NullableOption[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    @scala.inline
    def setPermissionType(value: NullableOption[String]): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionTypeNull: Self = StObject.set(x, "permissionType", null)
    
    @scala.inline
    def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setResourceAppId(value: NullableOption[String]): Self = StObject.set(x, "resourceAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAppIdNull: Self = StObject.set(x, "resourceAppId", null)
    
    @scala.inline
    def setResourceAppIdUndefined: Self = StObject.set(x, "resourceAppId", js.undefined)
  }
}
