package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath637Query250 extends StObject {
  
  var parameters: Path637Query250
  
  var responses: `200Content349`
}
object ParametersPath637Query250 {
  
  inline def apply(parameters: Path637Query250, responses: `200Content349`): ParametersPath637Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath637Query250]
  }
  
  extension [Self <: ParametersPath637Query250](x: Self) {
    
    inline def setParameters(value: Path637Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
