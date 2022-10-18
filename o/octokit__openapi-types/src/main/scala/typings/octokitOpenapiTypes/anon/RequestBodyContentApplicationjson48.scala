package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson48 extends StObject {
  
  var parameters: PathUsername
  
  var requestBody: ContentApplicationjson48
  
  var responses: `200403422`
}
object RequestBodyContentApplicationjson48 {
  
  inline def apply(parameters: PathUsername, requestBody: ContentApplicationjson48, responses: `200403422`): RequestBodyContentApplicationjson48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson48]
  }
  
  extension [Self <: RequestBodyContentApplicationjson48](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson48): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
