package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadIdentityPoolsResource extends StObject {
  
  var operations: OperationsResource
  
  var providers: ProvidersResource
}
object WorkloadIdentityPoolsResource {
  
  @scala.inline
  def apply(operations: OperationsResource, providers: ProvidersResource): WorkloadIdentityPoolsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkloadIdentityPoolsResource]
  }
  
  @scala.inline
  implicit class WorkloadIdentityPoolsResourceMutableBuilder[Self <: WorkloadIdentityPoolsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: ProvidersResource): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
  }
}
