package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath369 extends StObject {
  
  var parameters: Path369
  
  var responses: `404500`
}
object ParametersPath369 {
  
  inline def apply(parameters: Path369, responses: `404500`): ParametersPath369 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath369]
  }
  
  extension [Self <: ParametersPath369](x: Self) {
    
    inline def setParameters(value: Path369): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
