package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Responses200Content366 extends StObject {
  
  var parameters: Path615
  
  var responses: `200Content366`
}
object ParametersPath615Responses200Content366 {
  
  inline def apply(parameters: Path615, responses: `200Content366`): ParametersPath615Responses200Content366 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Responses200Content366]
  }
  
  extension [Self <: ParametersPath615Responses200Content366](x: Self) {
    
    inline def setParameters(value: Path615): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content366`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
