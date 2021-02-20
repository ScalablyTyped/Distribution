package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidersResource extends StObject {
  
  var operations: OperationsResource = js.native
}
object ProvidersResource {
  
  @scala.inline
  def apply(operations: OperationsResource): ProvidersResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidersResource]
  }
  
  @scala.inline
  implicit class ProvidersResourceMutableBuilder[Self <: ProvidersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
