package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata extends StObject {
  
  /** The location of the node, if different from instance location. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The id of the node. This should be equal to SaasInstanceNode.node_id. */
  var nodeId: js.UndefOr[String] = js.undefined
  
  /** If present, this will override eligibility for the node coming from instance or exclusions for specified SLIs. */
  var perSliEligibility: js.UndefOr[GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setPerSliEligibility(value: GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility): Self = StObject.set(x, "perSliEligibility", value.asInstanceOf[js.Any])
    
    inline def setPerSliEligibilityUndefined: Self = StObject.set(x, "perSliEligibility", js.undefined)
  }
}
