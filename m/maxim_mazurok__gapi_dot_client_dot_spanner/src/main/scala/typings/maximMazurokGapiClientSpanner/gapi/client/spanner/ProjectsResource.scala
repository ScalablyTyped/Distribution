package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var instanceConfigs: InstanceConfigsResource = js.native
  
  var instances: InstancesResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(instanceConfigs: InstanceConfigsResource, instances: InstancesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(instanceConfigs = instanceConfigs.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceConfigs(value: InstanceConfigsResource): Self = StObject.set(x, "instanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: InstancesResource): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
  }
}
