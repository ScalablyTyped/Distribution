package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath601 extends StObject {
  
  var parameters: Path601
  
  var responses: `200ContentApplicationjson428`
}
object ParametersPath601 {
  
  inline def apply(parameters: Path601, responses: `200ContentApplicationjson428`): ParametersPath601 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath601]
  }
  
  extension [Self <: ParametersPath601](x: Self) {
    
    inline def setParameters(value: Path601): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson428`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
