package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson87 extends StObject {
  
  var parameters: PathUsername
  
  var requestBody: ContentApplicationjson87
  
  var responses: `200403422`
}
object RequestBodyContentApplicationjson87 {
  
  inline def apply(parameters: PathUsername, requestBody: ContentApplicationjson87, responses: `200403422`): RequestBodyContentApplicationjson87 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson87]
  }
  
  extension [Self <: RequestBodyContentApplicationjson87](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson87): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
