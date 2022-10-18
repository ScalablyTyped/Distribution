package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings extends StObject {
  
  /**
    * Optional. Exclude instance from maintenance. When true, rollout service will not attempt maintenance on the instance. Rollout service will include the instance in reported rollout
    * progress as not attempted.
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. If the update call is triggered from rollback, set the value as true. */
  var isRollback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The MaintenancePolicies that have been attached to the instance. The key must be of the type name of the oneof policy name defined in MaintenancePolicy, and the embedded
    * policy must define the same policy type. For complete details of MaintenancePolicy, please refer to go/cloud-saas-mw-ug. If only the name is needed (like in the deprecated
    * Instance.maintenance_policy_names field) then only populate MaintenancePolicy.name.
    */
  var maintenancePolicies: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.managedidentities.gapi.client.managedidentities.MaintenancePolicy} */ js.Any
  ] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings]
  }
  
  extension [Self <: GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings](x: Self) {
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setIsRollback(value: Boolean): Self = StObject.set(x, "isRollback", value.asInstanceOf[js.Any])
    
    inline def setIsRollbackUndefined: Self = StObject.set(x, "isRollback", js.undefined)
    
    inline def setMaintenancePolicies(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.managedidentities.gapi.client.managedidentities.MaintenancePolicy} */ js.Any
    ): Self = StObject.set(x, "maintenancePolicies", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePoliciesUndefined: Self = StObject.set(x, "maintenancePolicies", js.undefined)
  }
}
