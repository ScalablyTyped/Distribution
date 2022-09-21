package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson268 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjson268
  
  var responses: `201267`
}
object RequestBodyContentApplicationjson268 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjson268, responses: `201267`): RequestBodyContentApplicationjson268 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson268]
  }
  
  extension [Self <: RequestBodyContentApplicationjson268](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson268): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201267`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
