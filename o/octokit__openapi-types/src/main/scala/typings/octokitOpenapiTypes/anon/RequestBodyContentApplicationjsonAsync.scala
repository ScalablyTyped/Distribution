package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAsync extends StObject {
  
  var parameters: PathUsername
  
  var requestBody: ContentApplicationjsonAsync
  
  var responses: `202403`
}
object RequestBodyContentApplicationjsonAsync {
  
  inline def apply(parameters: PathUsername, requestBody: ContentApplicationjsonAsync, responses: `202403`): RequestBodyContentApplicationjsonAsync = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAsync]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAsync](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAsync): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
