package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361Responses140 extends StObject {
  
  var parameters: Path361
  
  var responses: `140`
}
object ParametersPath361Responses140 {
  
  inline def apply(parameters: Path361, responses: `140`): ParametersPath361Responses140 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361Responses140]
  }
  
  extension [Self <: ParametersPath361Responses140](x: Self) {
    
    inline def setParameters(value: Path361): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
