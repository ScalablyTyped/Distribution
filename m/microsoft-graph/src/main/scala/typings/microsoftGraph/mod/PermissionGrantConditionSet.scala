package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGrantConditionSet
  extends StObject
     with Entity {
  
  var clientApplicationIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var clientApplicationPublisherIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var clientApplicationTenantIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var clientApplicationsFromVerifiedPublisherOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var permissionClassification: js.UndefOr[NullableOption[String]] = js.undefined
  
  var permissionType: js.UndefOr[NullableOption[PermissionType]] = js.undefined
  
  var permissions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var resourceApplication: js.UndefOr[NullableOption[String]] = js.undefined
}
object PermissionGrantConditionSet {
  
  inline def apply(): PermissionGrantConditionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGrantConditionSet]
  }
  
  extension [Self <: PermissionGrantConditionSet](x: Self) {
    
    inline def setClientApplicationIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationIds", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationIdsNull: Self = StObject.set(x, "clientApplicationIds", null)
    
    inline def setClientApplicationIdsUndefined: Self = StObject.set(x, "clientApplicationIds", js.undefined)
    
    inline def setClientApplicationIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationIds", js.Array(value :_*))
    
    inline def setClientApplicationPublisherIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationPublisherIds", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationPublisherIdsNull: Self = StObject.set(x, "clientApplicationPublisherIds", null)
    
    inline def setClientApplicationPublisherIdsUndefined: Self = StObject.set(x, "clientApplicationPublisherIds", js.undefined)
    
    inline def setClientApplicationPublisherIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationPublisherIds", js.Array(value :_*))
    
    inline def setClientApplicationTenantIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationTenantIds", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationTenantIdsNull: Self = StObject.set(x, "clientApplicationTenantIds", null)
    
    inline def setClientApplicationTenantIdsUndefined: Self = StObject.set(x, "clientApplicationTenantIds", js.undefined)
    
    inline def setClientApplicationTenantIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationTenantIds", js.Array(value :_*))
    
    inline def setClientApplicationsFromVerifiedPublisherOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "clientApplicationsFromVerifiedPublisherOnly", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationsFromVerifiedPublisherOnlyNull: Self = StObject.set(x, "clientApplicationsFromVerifiedPublisherOnly", null)
    
    inline def setClientApplicationsFromVerifiedPublisherOnlyUndefined: Self = StObject.set(x, "clientApplicationsFromVerifiedPublisherOnly", js.undefined)
    
    inline def setPermissionClassification(value: NullableOption[String]): Self = StObject.set(x, "permissionClassification", value.asInstanceOf[js.Any])
    
    inline def setPermissionClassificationNull: Self = StObject.set(x, "permissionClassification", null)
    
    inline def setPermissionClassificationUndefined: Self = StObject.set(x, "permissionClassification", js.undefined)
    
    inline def setPermissionType(value: NullableOption[PermissionType]): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeNull: Self = StObject.set(x, "permissionType", null)
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setPermissions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setResourceApplication(value: NullableOption[String]): Self = StObject.set(x, "resourceApplication", value.asInstanceOf[js.Any])
    
    inline def setResourceApplicationNull: Self = StObject.set(x, "resourceApplication", null)
    
    inline def setResourceApplicationUndefined: Self = StObject.set(x, "resourceApplication", js.undefined)
  }
}
