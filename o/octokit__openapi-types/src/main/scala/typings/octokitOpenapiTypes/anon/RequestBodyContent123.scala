package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent123 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: Content123
  
  var responses: `422ContentApplicationjson`
}
object RequestBodyContent123 {
  
  inline def apply(parameters: PathEnvironmentname, requestBody: Content123, responses: `422ContentApplicationjson`): RequestBodyContent123 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent123]
  }
  
  extension [Self <: RequestBodyContent123](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
