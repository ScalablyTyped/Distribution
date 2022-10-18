package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath643Responses354 extends StObject {
  
  var parameters: Path643
  
  var responses: `354`
}
object ParametersPath643Responses354 {
  
  inline def apply(parameters: Path643, responses: `354`): ParametersPath643Responses354 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath643Responses354]
  }
  
  extension [Self <: ParametersPath643Responses354](x: Self) {
    
    inline def setParameters(value: Path643): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
