package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath273Query250 extends StObject {
  
  var parameters: Path273Query250
  
  var responses: `200Content276`
}
object ParametersPath273Query250 {
  
  inline def apply(parameters: Path273Query250, responses: `200Content276`): ParametersPath273Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath273Query250]
  }
  
  extension [Self <: ParametersPath273Query250](x: Self) {
    
    inline def setParameters(value: Path273Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content276`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
