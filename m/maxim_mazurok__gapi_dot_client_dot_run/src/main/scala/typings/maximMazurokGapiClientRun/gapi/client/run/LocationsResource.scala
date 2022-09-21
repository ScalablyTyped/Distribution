package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var jobs: JobsResource
  
  var operations: OperationsResource
  
  var services: ServicesResource
}
object LocationsResource {
  
  inline def apply(jobs: JobsResource, operations: OperationsResource, services: ServicesResource): LocationsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setJobs(value: JobsResource): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setServices(value: ServicesResource): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
