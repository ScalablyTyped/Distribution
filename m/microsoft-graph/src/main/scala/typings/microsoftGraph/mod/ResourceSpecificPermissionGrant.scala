package typings.microsoftGraph.mod

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
  implicit class ResourceSpecificPermissionGrantOps[Self <: ResourceSpecificPermissionGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientAppId(value: NullableOption[String]): Self = this.set("clientAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAppId: Self = this.set("clientAppId", js.undefined)
    
    @scala.inline
    def setClientAppIdNull: Self = this.set("clientAppId", null)
    
    @scala.inline
    def setClientId(value: NullableOption[String]): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setClientIdNull: Self = this.set("clientId", null)
    
    @scala.inline
    def setPermission(value: NullableOption[String]): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setPermissionNull: Self = this.set("permission", null)
    
    @scala.inline
    def setPermissionType(value: NullableOption[String]): Self = this.set("permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionType: Self = this.set("permissionType", js.undefined)
    
    @scala.inline
    def setPermissionTypeNull: Self = this.set("permissionType", null)
    
    @scala.inline
    def setResourceAppId(value: NullableOption[String]): Self = this.set("resourceAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAppId: Self = this.set("resourceAppId", js.undefined)
    
    @scala.inline
    def setResourceAppIdNull: Self = this.set("resourceAppId", null)
  }
}
