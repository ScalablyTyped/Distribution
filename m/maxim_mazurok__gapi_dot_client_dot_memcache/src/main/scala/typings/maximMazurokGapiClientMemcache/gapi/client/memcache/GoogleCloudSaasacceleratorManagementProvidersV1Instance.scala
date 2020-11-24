package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1Instance extends js.Object {
  
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
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Deprecated. The MaintenancePolicies that have been attached to the instance. The key must be of the type name of the oneof policy name defined in MaintenancePolicy, and the
    * referenced policy must define the same policy type. For complete details of MaintenancePolicy, please refer to go/cloud-saas-mw-ug.
    */
  var maintenancePolicyNames: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /** The MaintenanceSchedule contains the scheduling information of published maintenance schedule with same key as software_versions. */
  var maintenanceSchedules: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.memcache.gapi.client.memcache.GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The MaintenanceSettings associated with instance. */
  var maintenanceSettings: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings] = js.native
  
  /** Unique name of the resource. It uses the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Custom string attributes used primarily to expose producer-specific information in monitoring dashboards. See go/get-instance-metadata. */
  var producerMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
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
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
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
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1InstanceOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1Instance] (val x: Self) extends AnyVal {
    
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
    def setConsumerDefinedName(value: String): Self = this.set("consumerDefinedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerDefinedName: Self = this.set("consumerDefinedName", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMaintenancePolicyNames(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = this.set("maintenancePolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenancePolicyNames: Self = this.set("maintenancePolicyNames", js.undefined)
    
    @scala.inline
    def setMaintenanceSchedules(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.memcache.gapi.client.memcache.GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = this.set("maintenanceSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceSchedules: Self = this.set("maintenanceSchedules", js.undefined)
    
    @scala.inline
    def setMaintenanceSettings(value: GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings): Self = this.set("maintenanceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceSettings: Self = this.set("maintenanceSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProducerMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = this.set("producerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerMetadata: Self = this.set("producerMetadata", js.undefined)
    
    @scala.inline
    def setProvisionedResourcesVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource*): Self = this.set("provisionedResources", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedResources(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]): Self = this.set("provisionedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedResources: Self = this.set("provisionedResources", js.undefined)
    
    @scala.inline
    def setSlmInstanceTemplate(value: String): Self = this.set("slmInstanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlmInstanceTemplate: Self = this.set("slmInstanceTemplate", js.undefined)
    
    @scala.inline
    def setSloMetadata(value: GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata): Self = this.set("sloMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSloMetadata: Self = this.set("sloMetadata", js.undefined)
    
    @scala.inline
    def setSoftwareVersions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudSaasacceleratorManagementProvidersV1Instance with TopLevel[js.Any]
    ): Self = this.set("softwareVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareVersions: Self = this.set("softwareVersions", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTenantProjectId(value: String): Self = this.set("tenantProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantProjectId: Self = this.set("tenantProjectId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
