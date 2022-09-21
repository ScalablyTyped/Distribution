package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath366 extends StObject {
  
  var parameters: Path366
  
  var responses: `200Content367`
}
object ParametersPath366 {
  
  inline def apply(parameters: Path366, responses: `200Content367`): ParametersPath366 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath366]
  }
  
  extension [Self <: ParametersPath366](x: Self) {
    
    inline def setParameters(value: Path366): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content367`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
