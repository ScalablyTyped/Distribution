package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata extends StObject {
  
  /**
    * By default node is eligible if instance is eligible. But individual node might be excluded from SLO by adding entry here. For semantic see SloMetadata.exclusions. If both instance
    * and node level exclusions are present for time period, the node level's reason will be reported by Eligibility Exporter.
    */
  var exclusions: js.UndefOr[js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]] = js.native
  
  /** The location of the node, if different from instance location. */
  var location: js.UndefOr[String] = js.native
  
  /** The id of the node. This should be equal to SaasInstanceNode.node_id. */
  var nodeId: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadataMutableBuilder[Self <: GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusions(value: js.Array[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
  }
}
