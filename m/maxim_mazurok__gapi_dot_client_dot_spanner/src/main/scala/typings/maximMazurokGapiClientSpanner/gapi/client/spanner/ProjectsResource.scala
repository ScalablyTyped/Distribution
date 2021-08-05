package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var instanceConfigs: InstanceConfigsResource
  
  var instances: InstancesResource
}
object ProjectsResource {
  
  inline def apply(instanceConfigs: InstanceConfigsResource, instances: InstancesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(instanceConfigs = instanceConfigs.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setInstanceConfigs(value: InstanceConfigsResource): Self = StObject.set(x, "instanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: InstancesResource): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
  }
}
