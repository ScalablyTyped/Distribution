package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata extends StObject {
  
  /**
    * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This field allows such producers to publish per-node SLO meta data, which will be consumed by
    * SSA Eligibility Exporter and published in the form of per node metric to Monarch.
    */
  var nodes: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]] = js.undefined
  
  /** Optional. Multiple per-instance SLI eligibilities which apply for individual SLIs. */
  var perSliEligibility: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility] = js.undefined
  
  /** Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers specified in the service SLO configuration. Field is mandatory and must not be empty. */
  var tier: js.UndefOr[String] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata]
  }
  
  extension [Self <: GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata](x: Self) {
    
    inline def setNodes(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPerSliEligibility(value: GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility): Self = StObject.set(x, "perSliEligibility", value.asInstanceOf[js.Any])
    
    inline def setPerSliEligibilityUndefined: Self = StObject.set(x, "perSliEligibility", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
