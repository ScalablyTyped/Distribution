package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var operations: OperationsResource
  
  var tenants: TenantsResource
}
object ProjectsResource {
  
  inline def apply(operations: OperationsResource, tenants: TenantsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setTenants(value: TenantsResource): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
  }
}
