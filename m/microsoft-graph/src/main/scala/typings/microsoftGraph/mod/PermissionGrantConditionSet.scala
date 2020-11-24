package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionGrantConditionSet extends Entity {
  
  var clientApplicationIds: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var clientApplicationPublisherIds: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var clientApplicationTenantIds: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var clientApplicationsFromVerifiedPublisherOnly: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var permissionClassification: js.UndefOr[NullableOption[String]] = js.native
  
  var permissionType: js.UndefOr[NullableOption[PermissionType]] = js.native
  
  var permissions: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var resourceApplication: js.UndefOr[NullableOption[String]] = js.native
}
object PermissionGrantConditionSet {
  
  @scala.inline
  def apply(): PermissionGrantConditionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGrantConditionSet]
  }
  
  @scala.inline
  implicit class PermissionGrantConditionSetOps[Self <: PermissionGrantConditionSet] (val x: Self) extends AnyVal {
    
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
    def setClientApplicationIdsVarargs(value: String*): Self = this.set("clientApplicationIds", js.Array(value :_*))
    
    @scala.inline
    def setClientApplicationIds(value: NullableOption[js.Array[String]]): Self = this.set("clientApplicationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientApplicationIds: Self = this.set("clientApplicationIds", js.undefined)
    
    @scala.inline
    def setClientApplicationIdsNull: Self = this.set("clientApplicationIds", null)
    
    @scala.inline
    def setClientApplicationPublisherIdsVarargs(value: String*): Self = this.set("clientApplicationPublisherIds", js.Array(value :_*))
    
    @scala.inline
    def setClientApplicationPublisherIds(value: NullableOption[js.Array[String]]): Self = this.set("clientApplicationPublisherIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientApplicationPublisherIds: Self = this.set("clientApplicationPublisherIds", js.undefined)
    
    @scala.inline
    def setClientApplicationPublisherIdsNull: Self = this.set("clientApplicationPublisherIds", null)
    
    @scala.inline
    def setClientApplicationTenantIdsVarargs(value: String*): Self = this.set("clientApplicationTenantIds", js.Array(value :_*))
    
    @scala.inline
    def setClientApplicationTenantIds(value: NullableOption[js.Array[String]]): Self = this.set("clientApplicationTenantIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientApplicationTenantIds: Self = this.set("clientApplicationTenantIds", js.undefined)
    
    @scala.inline
    def setClientApplicationTenantIdsNull: Self = this.set("clientApplicationTenantIds", null)
    
    @scala.inline
    def setClientApplicationsFromVerifiedPublisherOnly(value: NullableOption[Boolean]): Self = this.set("clientApplicationsFromVerifiedPublisherOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientApplicationsFromVerifiedPublisherOnly: Self = this.set("clientApplicationsFromVerifiedPublisherOnly", js.undefined)
    
    @scala.inline
    def setClientApplicationsFromVerifiedPublisherOnlyNull: Self = this.set("clientApplicationsFromVerifiedPublisherOnly", null)
    
    @scala.inline
    def setPermissionClassification(value: NullableOption[String]): Self = this.set("permissionClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionClassification: Self = this.set("permissionClassification", js.undefined)
    
    @scala.inline
    def setPermissionClassificationNull: Self = this.set("permissionClassification", null)
    
    @scala.inline
    def setPermissionType(value: NullableOption[PermissionType]): Self = this.set("permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionType: Self = this.set("permissionType", js.undefined)
    
    @scala.inline
    def setPermissionTypeNull: Self = this.set("permissionType", null)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: NullableOption[js.Array[String]]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setPermissionsNull: Self = this.set("permissions", null)
    
    @scala.inline
    def setResourceApplication(value: NullableOption[String]): Self = this.set("resourceApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceApplication: Self = this.set("resourceApplication", js.undefined)
    
    @scala.inline
    def setResourceApplicationNull: Self = this.set("resourceApplication", null)
  }
}
