package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath135Responses62 extends StObject {
  
  var parameters: Path135
  
  var responses: `62`
}
object ParametersPath135Responses62 {
  
  inline def apply(parameters: Path135, responses: `62`): ParametersPath135Responses62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath135Responses62]
  }
  
  extension [Self <: ParametersPath135Responses62](x: Self) {
    
    inline def setParameters(value: Path135): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `62`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
