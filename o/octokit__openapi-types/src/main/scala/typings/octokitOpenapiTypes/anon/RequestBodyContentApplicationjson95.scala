package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson95 extends StObject {
  
  var parameters: PathUsername
  
  var requestBody: ContentApplicationjson95
  
  var responses: `200403422`
}
object RequestBodyContentApplicationjson95 {
  
  inline def apply(parameters: PathUsername, requestBody: ContentApplicationjson95, responses: `200403422`): RequestBodyContentApplicationjson95 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson95]
  }
  
  extension [Self <: RequestBodyContentApplicationjson95](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson95): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
