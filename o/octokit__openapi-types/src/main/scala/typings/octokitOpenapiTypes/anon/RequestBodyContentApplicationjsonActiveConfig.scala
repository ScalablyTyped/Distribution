package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonActiveConfig extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonActiveConfig
  
  var responses: `201ContentApplicationjsonActive`
}
object RequestBodyContentApplicationjsonActiveConfig {
  
  inline def apply(
    parameters: `37`,
    requestBody: ContentApplicationjsonActiveConfig,
    responses: `201ContentApplicationjsonActive`
  ): RequestBodyContentApplicationjsonActiveConfig = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonActiveConfig]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonActiveConfig](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonActiveConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonActive`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
