package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath317 extends StObject {
  
  var parameters: Path317
  
  var responses: `200Content316`
}
object ParametersPath317 {
  
  inline def apply(parameters: Path317, responses: `200Content316`): ParametersPath317 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath317]
  }
  
  extension [Self <: ParametersPath317](x: Self) {
    
    inline def setParameters(value: Path317): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content316`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
