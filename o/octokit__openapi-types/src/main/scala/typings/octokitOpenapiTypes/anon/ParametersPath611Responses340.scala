package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath611Responses340 extends StObject {
  
  var parameters: Path611
  
  var responses: `340`
}
object ParametersPath611Responses340 {
  
  inline def apply(parameters: Path611, responses: `340`): ParametersPath611Responses340 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath611Responses340]
  }
  
  extension [Self <: ParametersPath611Responses340](x: Self) {
    
    inline def setParameters(value: Path611): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `340`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
