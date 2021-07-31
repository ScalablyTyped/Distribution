package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata extends StObject {
  
  /** Optional. User-defined instance eligibility. */
  var eligibility: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility] = js.undefined
  
  /**
    * List of SLO exclusion windows. When multiple entries in the list match (matching the exclusion time-window against current time point) the exclusion reason used in the first
    * matching entry will be published. It is not needed to include expired exclusion in this list, as only the currently applicable exclusions are taken into account by the eligibility
    * exporting subsystem (the historical state of exclusions will be reflected in the historically produced timeseries regardless of the current state). This field can be used to mark
    * the instance as temporary ineligible for the purpose of SLO calculation. For permanent instance SLO exclusion, use of custom instance eligibility is recommended. See 'eligibility'
    * field below.
    */
  var exclusions: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]] = js.undefined
  
  /**
    * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This field allows such producers to publish per-node SLO meta data, which will be consumed by
    * SSA Eligibility Exporter and published in the form of per node metric to Monarch.
    */
  var nodes: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]] = js.undefined
  
  /** Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers specified in the service SLO configuration. Field is mandatory and must not be empty. */
  var tier: js.UndefOr[String] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1SloMetadataMutableBuilder[Self <: GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEligibility(value: GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    @scala.inline
    def setExclusions(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
