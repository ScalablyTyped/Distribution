package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurlMessage404 extends StObject {
  
  var parameters: Path611
  
  var requestBody: ContentApplicationjson67
  
  var responses: `403ContentApplicationjsonDocumentationurlMessage404`
}
object Responses403ContentApplicationjsonDocumentationurlMessage404 {
  
  inline def apply(
    parameters: Path611,
    requestBody: ContentApplicationjson67,
    responses: `403ContentApplicationjsonDocumentationurlMessage404`
  ): Responses403ContentApplicationjsonDocumentationurlMessage404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurlMessage404]
  }
  
  extension [Self <: Responses403ContentApplicationjsonDocumentationurlMessage404](x: Self) {
    
    inline def setParameters(value: Path611): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson67): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurlMessage404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
