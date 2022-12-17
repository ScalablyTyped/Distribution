package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonConfig extends StObject {
  
  var parameters: PathHookid
  
  var requestBody: ContentApplicationjsonConfig
  
  var responses: `20077404`
}
object RequestBodyContentApplicationjsonConfig {
  
  inline def apply(parameters: PathHookid, requestBody: ContentApplicationjsonConfig, responses: `20077404`): RequestBodyContentApplicationjsonConfig = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonConfig]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonConfig](x: Self) {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20077404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
