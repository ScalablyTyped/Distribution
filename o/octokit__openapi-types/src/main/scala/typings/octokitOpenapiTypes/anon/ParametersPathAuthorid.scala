package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAuthorid extends StObject {
  
  var parameters: PathAuthorid
  
  var requestBody: ContentApplicationjson258
  
  var responses: `200Content257`
}
object ParametersPathAuthorid {
  
  inline def apply(parameters: PathAuthorid, requestBody: ContentApplicationjson258, responses: `200Content257`): ParametersPathAuthorid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAuthorid]
  }
  
  extension [Self <: ParametersPathAuthorid](x: Self) {
    
    inline def setParameters(value: PathAuthorid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson258): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content257`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
