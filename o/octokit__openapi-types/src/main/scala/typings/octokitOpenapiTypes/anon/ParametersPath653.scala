package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath653 extends StObject {
  
  var parameters: Path653
  
  var responses: `200Content268`
}
object ParametersPath653 {
  
  inline def apply(parameters: Path653, responses: `200Content268`): ParametersPath653 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath653]
  }
  
  extension [Self <: ParametersPath653](x: Self) {
    
    inline def setParameters(value: Path653): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content268`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
