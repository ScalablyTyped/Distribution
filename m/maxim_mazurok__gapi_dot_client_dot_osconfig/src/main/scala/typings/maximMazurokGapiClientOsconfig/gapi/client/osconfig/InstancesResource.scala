package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesResource extends StObject {
  
  var inventories: InventoriesResource
  
  var osPolicyAssignments: OsPolicyAssignmentsResource
  
  var vulnerabilityReports: VulnerabilityReportsResource
}
object InstancesResource {
  
  inline def apply(
    inventories: InventoriesResource,
    osPolicyAssignments: OsPolicyAssignmentsResource,
    vulnerabilityReports: VulnerabilityReportsResource
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(inventories = inventories.asInstanceOf[js.Any], osPolicyAssignments = osPolicyAssignments.asInstanceOf[js.Any], vulnerabilityReports = vulnerabilityReports.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesResource]
  }
  
  extension [Self <: InstancesResource](x: Self) {
    
    inline def setInventories(value: InventoriesResource): Self = StObject.set(x, "inventories", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignments(value: OsPolicyAssignmentsResource): Self = StObject.set(x, "osPolicyAssignments", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityReports(value: VulnerabilityReportsResource): Self = StObject.set(x, "vulnerabilityReports", value.asInstanceOf[js.Any])
  }
}
