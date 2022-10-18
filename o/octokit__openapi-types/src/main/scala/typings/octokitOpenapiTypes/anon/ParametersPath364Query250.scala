package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath364Query250 extends StObject {
  
  var parameters: Path364Query250
  
  var responses: `377`
}
object ParametersPath364Query250 {
  
  inline def apply(parameters: Path364Query250, responses: `377`): ParametersPath364Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath364Query250]
  }
  
  extension [Self <: ParametersPath364Query250](x: Self) {
    
    inline def setParameters(value: Path364Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `377`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
