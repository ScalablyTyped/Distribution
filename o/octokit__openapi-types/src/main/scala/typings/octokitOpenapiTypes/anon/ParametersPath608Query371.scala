package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608Query371 extends StObject {
  
  var parameters: Path608Query371
  
  var responses: `200Content372`
}
object ParametersPath608Query371 {
  
  inline def apply(parameters: Path608Query371, responses: `200Content372`): ParametersPath608Query371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608Query371]
  }
  
  extension [Self <: ParametersPath608Query371](x: Self) {
    
    inline def setParameters(value: Path608Query371): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content372`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
