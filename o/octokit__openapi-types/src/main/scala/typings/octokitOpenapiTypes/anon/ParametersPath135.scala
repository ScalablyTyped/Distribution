package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath135 extends StObject {
  
  var parameters: Path135
  
  var responses: `200304401403404`
}
object ParametersPath135 {
  
  inline def apply(parameters: Path135, responses: `200304401403404`): ParametersPath135 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath135]
  }
  
  extension [Self <: ParametersPath135](x: Self) {
    
    inline def setParameters(value: Path135): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
