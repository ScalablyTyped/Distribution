package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var operations: OperationsResource
  
  var workers: WorkersResource
}
object ProjectsResource {
  
  inline def apply(operations: OperationsResource, workers: WorkersResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setWorkers(value: WorkersResource): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
  }
}
