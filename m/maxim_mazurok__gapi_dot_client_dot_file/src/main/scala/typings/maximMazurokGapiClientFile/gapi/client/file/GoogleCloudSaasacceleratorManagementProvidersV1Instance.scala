package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1Instance extends StObject {
  
  /**
    * consumer_defined_name is the name that is set by the consumer. On the other hand Name field represents system-assigned id of an instance so consumers are not necessarily aware of
    * it. consumer_defined_name is used for notification/UI purposes for consumer to recognize their instances.
    */
  var consumerDefinedName: js.UndefOr[String] = js.native
  
  /** Output only. Timestamp when the resource was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Resource labels to represent user provided metadata. Each label is a key-value pair, where both the key and the value are arbitrary strings provided by the user. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Deprecated. The MaintenancePolicies that have been attached to the instance. The key must be of the type name of the oneof policy name defined in MaintenancePolicy, and the
    * referenced policy must define the same policy type. For complete details of MaintenancePolicy, please refer to go/cloud-saas-mw-ug.
    */
  var maintenancePolicyNames: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /** The MaintenanceSchedule contains the scheduling information of published maintenance schedule with same key as software_versions. */
  var maintenanceSchedules: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.file.gapi.client.file.GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The MaintenanceSettings associated with instance. */
  var maintenanceSettings: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings] = js.native
  
  /** Unique name of the resource. It uses the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Custom string attributes used primarily to expose producer-specific information in monitoring dashboards. See go/get-instance-metadata. */
  var producerMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs. See go/get-instance-metadata. */
  var provisionedResources: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]] = js.native
  
  /**
    * Link to the SLM instance template. Only populated when updating SLM instances via SSA's Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL)
    * doesn't need to populate this field. Instead they should use software_versions.
    */
  var slmInstanceTemplate: js.UndefOr[String] = js.native
  
  /** Output only. SLO metadata for instance classification in the Standardized dataplane SLO platform. See go/cloud-ssa-standard-slo for feature description. */
  var sloMetadata: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata] = js.native
  
  /** Software versions that are used to deploy this instance. This can be mutated by rollout services. */
  var softwareVersions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to use). */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. ID of the associated GCP tenant project. See go/get-instance-metadata. */
  var tenantProjectId: js.UndefOr[String] = js.native
  
  /** Output only. Timestamp when the resource was last modified. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1Instance {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1Instance]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1InstanceMutableBuilder[Self <: GoogleCloudSaasacceleratorManagementProvidersV1Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerDefinedName(value: String): Self = StObject.set(x, "consumerDefinedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerDefinedNameUndefined: Self = StObject.set(x, "consumerDefinedName", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMaintenancePolicyNames(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = StObject.set(x, "maintenancePolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenancePolicyNamesUndefined: Self = StObject.set(x, "maintenancePolicyNames", js.undefined)
    
    @scala.inline
    def setMaintenanceSchedules(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.file.gapi.client.file.GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = StObject.set(x, "maintenanceSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceSchedulesUndefined: Self = StObject.set(x, "maintenanceSchedules", js.undefined)
    
    @scala.inline
    def setMaintenanceSettings(value: GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings): Self = StObject.set(x, "maintenanceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceSettingsUndefined: Self = StObject.set(x, "maintenanceSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProducerMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = StObject.set(x, "producerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerMetadataUndefined: Self = StObject.set(x, "producerMetadata", js.undefined)
    
    @scala.inline
    def setProvisionedResources(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]): Self = StObject.set(x, "provisionedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedResourcesUndefined: Self = StObject.set(x, "provisionedResources", js.undefined)
    
    @scala.inline
    def setProvisionedResourcesVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource*): Self = StObject.set(x, "provisionedResources", js.Array(value :_*))
    
    @scala.inline
    def setSlmInstanceTemplate(value: String): Self = StObject.set(x, "slmInstanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlmInstanceTemplateUndefined: Self = StObject.set(x, "slmInstanceTemplate", js.undefined)
    
    @scala.inline
    def setSloMetadata(value: GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata): Self = StObject.set(x, "sloMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSloMetadataUndefined: Self = StObject.set(x, "sloMetadata", js.undefined)
    
    @scala.inline
    def setSoftwareVersions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = StObject.set(x, "softwareVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersionsUndefined: Self = StObject.set(x, "softwareVersions", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTenantProjectId(value: String): Self = StObject.set(x, "tenantProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectIdUndefined: Self = StObject.set(x, "tenantProjectId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
