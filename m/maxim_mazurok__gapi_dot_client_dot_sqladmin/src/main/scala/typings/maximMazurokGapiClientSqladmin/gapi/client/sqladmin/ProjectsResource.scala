package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var instances: InstancesResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(instances: InstancesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: InstancesResource): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
  }
}
