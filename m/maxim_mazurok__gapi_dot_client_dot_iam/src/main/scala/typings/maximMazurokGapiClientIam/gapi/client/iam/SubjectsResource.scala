package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectsResource extends StObject {
  
  var operations: OperationsResource
}
object SubjectsResource {
  
  inline def apply(operations: OperationsResource): SubjectsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectsResource] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
