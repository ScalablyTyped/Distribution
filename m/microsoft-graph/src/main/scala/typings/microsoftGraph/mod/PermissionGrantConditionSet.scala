package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGrantConditionSet
  extends StObject
     with Entity {
  
  /**
    * A list of appId values for the client applications to match with, or a list with the single value all to match any
    * client application. Default is the single value all.
    */
  var clientApplicationIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the
    * single value all to match with client apps from any publisher. Default is the single value all.
    */
  var clientApplicationPublisherIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * A list of Azure Active Directory tenant IDs in which the client application is registered, or a list with the single
    * value all to match with client apps registered in any tenant. Default is the single value all.
    */
  var clientApplicationTenantIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Set to true to only match on client applications with a verified publisher. Set to false to match on any client app,
    * even if it does not have a verified publisher. Default is false.
    */
  var clientApplicationsFromVerifiedPublisherOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The permission classification for the permission being granted, or all to match with any permission classification
    * (including permissions which are not classified). Default is all.
    */
  var permissionClassification: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The permission type of the permission being granted. Possible values: application for application permissions (e.g. app
    * roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions
    * which have not been configured by the API publisher to require admin consent—this value may be used in built-in
    * permission grant policies, but cannot be used in custom permission grant policies. Required.
    */
  var permissionType: js.UndefOr[NullableOption[PermissionType]] = js.undefined
  
  /**
    * The list of id values for the specific permissions to match with, or a list with the single value all to match with any
    * permission. The id of delegated permissions can be found in the oauth2PermissionScopes property of the API's
    * **servicePrincipal** object. The id of application permissions can be found in the appRoles property of the API's
    * **servicePrincipal** object. The id of resource-specific application permissions can be found in the
    * resourceSpecificApplicationPermissions property of the API's **servicePrincipal** object. Default is the single value
    * all.
    */
  var permissions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any
    * resource application or API. Default is any.
    */
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
    
    inline def setClientApplicationIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationIds", js.Array(value*))
    
    inline def setClientApplicationPublisherIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationPublisherIds", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationPublisherIdsNull: Self = StObject.set(x, "clientApplicationPublisherIds", null)
    
    inline def setClientApplicationPublisherIdsUndefined: Self = StObject.set(x, "clientApplicationPublisherIds", js.undefined)
    
    inline def setClientApplicationPublisherIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationPublisherIds", js.Array(value*))
    
    inline def setClientApplicationTenantIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "clientApplicationTenantIds", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationTenantIdsNull: Self = StObject.set(x, "clientApplicationTenantIds", null)
    
    inline def setClientApplicationTenantIdsUndefined: Self = StObject.set(x, "clientApplicationTenantIds", js.undefined)
    
    inline def setClientApplicationTenantIdsVarargs(value: String*): Self = StObject.set(x, "clientApplicationTenantIds", js.Array(value*))
    
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
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setResourceApplication(value: NullableOption[String]): Self = StObject.set(x, "resourceApplication", value.asInstanceOf[js.Any])
    
    inline def setResourceApplicationNull: Self = StObject.set(x, "resourceApplication", null)
    
    inline def setResourceApplicationUndefined: Self = StObject.set(x, "resourceApplication", js.undefined)
  }
}
