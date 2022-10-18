package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath610Responses65 extends StObject {
  
  var parameters: Path610
  
  var responses: `65`
}
object ParametersPath610Responses65 {
  
  inline def apply(parameters: Path610, responses: `65`): ParametersPath610Responses65 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath610Responses65]
  }
  
  extension [Self <: ParametersPath610Responses65](x: Self) {
    
    inline def setParameters(value: Path610): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `65`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
