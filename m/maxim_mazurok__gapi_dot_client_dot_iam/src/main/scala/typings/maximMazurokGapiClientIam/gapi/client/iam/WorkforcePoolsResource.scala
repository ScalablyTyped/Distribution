package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkforcePoolsResource extends StObject {
  
  var operations: OperationsResource
  
  var providers: ProvidersResource
  
  var subjects: SubjectsResource
}
object WorkforcePoolsResource {
  
  inline def apply(operations: OperationsResource, providers: ProvidersResource, subjects: SubjectsResource): WorkforcePoolsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkforcePoolsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkforcePoolsResource] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: ProvidersResource): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setSubjects(value: SubjectsResource): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
  }
}
