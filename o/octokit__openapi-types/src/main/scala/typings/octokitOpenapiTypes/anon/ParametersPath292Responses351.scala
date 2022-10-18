package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292Responses351 extends StObject {
  
  var parameters: Path292
  
  var responses: `351`
}
object ParametersPath292Responses351 {
  
  inline def apply(parameters: Path292, responses: `351`): ParametersPath292Responses351 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292Responses351]
  }
  
  extension [Self <: ParametersPath292Responses351](x: Self) {
    
    inline def setParameters(value: Path292): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `351`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
