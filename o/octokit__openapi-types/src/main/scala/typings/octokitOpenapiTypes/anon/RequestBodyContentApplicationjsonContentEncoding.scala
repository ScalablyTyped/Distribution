package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContentEncoding extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonContentEncoding
  
  var responses: `403404409`
}
object RequestBodyContentApplicationjsonContentEncoding {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonContentEncoding, responses: `403404409`): RequestBodyContentApplicationjsonContentEncoding = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContentEncoding]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonContentEncoding](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContentEncoding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
