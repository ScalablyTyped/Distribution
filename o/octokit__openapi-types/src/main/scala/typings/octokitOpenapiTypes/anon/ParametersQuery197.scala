package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery197 extends StObject {
  
  var parameters: Query197
  
  var responses: `200Content198`
}
object ParametersQuery197 {
  
  inline def apply(parameters: Query197, responses: `200Content198`): ParametersQuery197 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery197]
  }
  
  extension [Self <: ParametersQuery197](x: Self) {
    
    inline def setParameters(value: Query197): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content198`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
