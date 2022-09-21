package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599Responses461 extends StObject {
  
  var parameters: Path599
  
  var responses: `461`
}
object ParametersPath599Responses461 {
  
  inline def apply(parameters: Path599, responses: `461`): ParametersPath599Responses461 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599Responses461]
  }
  
  extension [Self <: ParametersPath599Responses461](x: Self) {
    
    inline def setParameters(value: Path599): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `461`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
