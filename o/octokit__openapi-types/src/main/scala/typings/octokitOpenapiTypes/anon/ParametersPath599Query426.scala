package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599Query426 extends StObject {
  
  var parameters: Path599Query426
  
  var responses: `200Content435`
}
object ParametersPath599Query426 {
  
  inline def apply(parameters: Path599Query426, responses: `200Content435`): ParametersPath599Query426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599Query426]
  }
  
  extension [Self <: ParametersPath599Query426](x: Self) {
    
    inline def setParameters(value: Path599Query426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content435`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
