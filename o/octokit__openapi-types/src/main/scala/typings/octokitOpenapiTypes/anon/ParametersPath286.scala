package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath286 extends StObject {
  
  var parameters: Path286
  
  var responses: `200Content287`
}
object ParametersPath286 {
  
  inline def apply(parameters: Path286, responses: `200Content287`): ParametersPath286 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath286]
  }
  
  extension [Self <: ParametersPath286](x: Self) {
    
    inline def setParameters(value: Path286): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content287`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
