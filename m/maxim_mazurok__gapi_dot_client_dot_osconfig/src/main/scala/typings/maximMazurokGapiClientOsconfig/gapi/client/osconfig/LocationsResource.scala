package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var instances: InstancesResource
  
  var osPolicyAssignments: OsPolicyAssignmentsResource
}
object LocationsResource {
  
  inline def apply(instances: InstancesResource, osPolicyAssignments: OsPolicyAssignmentsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any], osPolicyAssignments = osPolicyAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setInstances(value: InstancesResource): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignments(value: OsPolicyAssignmentsResource): Self = StObject.set(x, "osPolicyAssignments", value.asInstanceOf[js.Any])
  }
}
