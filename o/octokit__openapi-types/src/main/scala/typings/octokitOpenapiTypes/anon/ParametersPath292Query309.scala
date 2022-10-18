package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292Query309 extends StObject {
  
  var parameters: Path292Query309
  
  var responses: `200Content592`
}
object ParametersPath292Query309 {
  
  inline def apply(parameters: Path292Query309, responses: `200Content592`): ParametersPath292Query309 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292Query309]
  }
  
  extension [Self <: ParametersPath292Query309](x: Self) {
    
    inline def setParameters(value: Path292Query309): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
