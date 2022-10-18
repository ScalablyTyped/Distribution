package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonExcludemetadata extends StObject {
  
  var requestBody: ContentApplicationjsonExcludemetadata
  
  var responses: `201304401403422`
}
object RequestBodyContentApplicationjsonExcludemetadata {
  
  inline def apply(requestBody: ContentApplicationjsonExcludemetadata, responses: `201304401403422`): RequestBodyContentApplicationjsonExcludemetadata = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonExcludemetadata]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonExcludemetadata](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonExcludemetadata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
