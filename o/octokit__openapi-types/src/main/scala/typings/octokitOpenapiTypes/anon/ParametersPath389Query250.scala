package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath389Query250 extends StObject {
  
  var parameters: Path389Query250
  
  var responses: `200Content393`
}
object ParametersPath389Query250 {
  
  inline def apply(parameters: Path389Query250, responses: `200Content393`): ParametersPath389Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath389Query250]
  }
  
  extension [Self <: ParametersPath389Query250](x: Self) {
    
    inline def setParameters(value: Path389Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content393`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
