package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata extends js.Object {
  
  /** Optional. User-defined instance eligibility. */
  var eligibility: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility] = js.native
  
  /**
    * List of SLO exclusion windows. When multiple entries in the list match (matching the exclusion time-window against current time point) the exclusion reason used in the first
    * matching entry will be published. It is not needed to include expired exclusion in this list, as only the currently applicable exclusions are taken into account by the eligibility
    * exporting subsystem (the historical state of exclusions will be reflected in the historically produced timeseries regardless of the current state). This field can be used to mark
    * the instance as temporary ineligible for the purpose of SLO calculation. For permanent instance SLO exclusion, use of custom instance eligibility is recommended. See 'eligibility'
    * field below.
    */
  var exclusions: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]] = js.native
  
  /**
    * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This field allows such producers to publish per-node SLO meta data, which will be consumed by
    * SSA Eligibility Exporter and published in the form of per node metric to Monarch.
    */
  var nodes: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]] = js.native
  
  /** Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers specified in the service SLO configuration. Field is mandatory and must not be empty. */
  var tier: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1SloMetadataOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata] (val x: Self) extends AnyVal {
    
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
    def setEligibility(value: GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility): Self = this.set("eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibility: Self = this.set("eligibility", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
  }
}
