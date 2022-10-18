package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608RequestBodyContentApplicationjson62 extends StObject {
  
  var parameters: Path608
  
  var requestBody: ContentApplicationjson62
  
  var responses: `609`
}
object ParametersPath608RequestBodyContentApplicationjson62 {
  
  inline def apply(parameters: Path608, requestBody: ContentApplicationjson62, responses: `609`): ParametersPath608RequestBodyContentApplicationjson62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608RequestBodyContentApplicationjson62]
  }
  
  extension [Self <: ParametersPath608RequestBodyContentApplicationjson62](x: Self) {
    
    inline def setParameters(value: Path608): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `609`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
