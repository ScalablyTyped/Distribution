package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class PermissionGrantConditionSetMutableBuilder[Self <: PermissionGrantConditionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientApplicationIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientApplicationIdsNull: Self = StObject.set(x, "clientApplicationIds", null)
    
    @scala.inline
    def setClientApplicationIdsUndefined: Self = StObject.set(x, "clientApplicationIds", js.undefined)
    
    @scala.inline
    def setClientApplicationIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationIds", js.Array(value :_*))
    
    @scala.inline
    def setClientApplicationPublisherIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationPublisherIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientApplicationPublisherIdsNull: Self = StObject.set(x, "clientApplicationPublisherIds", null)
    
    @scala.inline
    def setClientApplicationPublisherIdsUndefined: Self = StObject.set(x, "clientApplicationPublisherIds", js.undefined)
    
    @scala.inline
    def setClientApplicationPublisherIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationPublisherIds", js.Array(value :_*))
    
    @scala.inline
    def setClientApplicationTenantIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationTenantIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientApplicationTenantIdsNull: Self = StObject.set(x, "clientApplicationTenantIds", null)
    
    @scala.inline
    def setClientApplicationTenantIdsUndefined: Self = StObject.set(x, "clientApplicationTenantIds", js.undefined)
    
    @scala.inline
    def setClientApplicationTenantIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationTenantIds", js.Array(value :_*))
    
    @scala.inline
    def setClientApplicationsFromVerifiedPublisherOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "clientApplicationsFromVerifiedPublisherOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientApplicationsFromVerifiedPublisherOnlyNull: Self = StObject.set(x, "clientApplicationsFromVerifiedPublisherOnly", null)
    
    @scala.inline
    def setClientApplicationsFromVerifiedPublisherOnlyUndefined: Self = StObject.set(x, "clientApplicationsFromVerifiedPublisherOnly", js.undefined)
    
    @scala.inline
    def setPermissionClassification(value: NullableOption[String]): Self = StObject.set(x, "permissionClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionClassificationNull: Self = StObject.set(x, "permissionClassification", null)
    
    @scala.inline
    def setPermissionClassificationUndefined: Self = StObject.set(x, "permissionClassification", js.undefined)
    
    @scala.inline
    def setPermissionType(value: NullableOption[PermissionType]): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionTypeNull: Self = StObject.set(x, "permissionType", null)
    
    @scala.inline
    def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    @scala.inline
    def setPermissions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setResourceApplication(value: NullableOption[String]): Self = StObject.set(x, "resourceApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceApplicationNull: Self = StObject.set(x, "resourceApplication", null)
    
    @scala.inline
    def setResourceApplicationUndefined: Self = StObject.set(x, "resourceApplication", js.undefined)
  }
}
