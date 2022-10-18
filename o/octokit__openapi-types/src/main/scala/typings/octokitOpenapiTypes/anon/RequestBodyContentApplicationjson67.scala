package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson67 extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var requestBody: ContentApplicationjson67
  
  var responses: `403ContentApplicationjsonDocumentationurlMessage404Content6`
}
object RequestBodyContentApplicationjson67 {
  
  inline def apply(
    parameters: PathProjectidTeamid,
    requestBody: ContentApplicationjson67,
    responses: `403ContentApplicationjsonDocumentationurlMessage404Content6`
  ): RequestBodyContentApplicationjson67 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson67]
  }
  
  extension [Self <: RequestBodyContentApplicationjson67](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson67): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurlMessage404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
