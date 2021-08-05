package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvidersResource extends StObject {
  
  var operations: OperationsResource
}
object ProvidersResource {
  
  inline def apply(operations: OperationsResource): ProvidersResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidersResource]
  }
  
  extension [Self <: ProvidersResource](x: Self) {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
