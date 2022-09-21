package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361Responses200Content33 extends StObject {
  
  var parameters: Path361
  
  var responses: `200Content33`
}
object ParametersPath361Responses200Content33 {
  
  inline def apply(parameters: Path361, responses: `200Content33`): ParametersPath361Responses200Content33 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361Responses200Content33]
  }
  
  extension [Self <: ParametersPath361Responses200Content33](x: Self) {
    
    inline def setParameters(value: Path361): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content33`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
