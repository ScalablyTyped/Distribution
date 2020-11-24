package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings extends js.Object {
  
  /**
    * Optional. Exclude instance from maintenance. When true, rollout service will not attempt maintenance on the instance. Rollout service will include the instance in reported rollout
    * progress as not attempted.
    */
  var exclude: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The MaintenancePolicies that have been attached to the instance. The key must be of the type name of the oneof policy name defined in MaintenancePolicy, and the embedded
    * policy must define the same policy type. For complete details of MaintenancePolicy, please refer to go/cloud-saas-mw-ug. If only the name is needed (like in the deprecated
    * Instance.maintenance_policy_names field) then only populate MaintenancePolicy.name.
    */
  var maintenancePolicies: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.managedidentities.gapi.client.managedidentities.MaintenancePolicy}
    */ typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettingsOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings] (val x: Self) extends AnyVal {
    
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
    def setExclude(value: Boolean): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setMaintenancePolicies(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.managedidentities.gapi.client.managedidentities.MaintenancePolicy}
      */ typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings with TopLevel[js.Any]
    ): Self = this.set("maintenancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenancePolicies: Self = this.set("maintenancePolicies", js.undefined)
  }
}
