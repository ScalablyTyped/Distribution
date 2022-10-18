package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath389 extends StObject {
  
  var parameters: Path389
  
  var responses: `200Content360`
}
object ParametersPath389 {
  
  inline def apply(parameters: Path389, responses: `200Content360`): ParametersPath389 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath389]
  }
  
  extension [Self <: ParametersPath389](x: Self) {
    
    inline def setParameters(value: Path389): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content360`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
