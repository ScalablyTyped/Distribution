package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361Responses200Content30 extends StObject {
  
  var parameters: Path361
  
  var responses: `200Content30`
}
object ParametersPath361Responses200Content30 {
  
  inline def apply(parameters: Path361, responses: `200Content30`): ParametersPath361Responses200Content30 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361Responses200Content30]
  }
  
  extension [Self <: ParametersPath361Responses200Content30](x: Self) {
    
    inline def setParameters(value: Path361): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content30`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
