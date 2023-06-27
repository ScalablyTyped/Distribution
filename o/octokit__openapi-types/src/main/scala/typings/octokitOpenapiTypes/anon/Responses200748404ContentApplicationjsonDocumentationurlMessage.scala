package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200748404ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: js.UndefOr[ContentApplicationjsonMakelatest] = js.undefined
  
  var responses: `200748404ContentApplicationjsonDocumentationurlMessage`
}
object Responses200748404ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    responses: `200748404ContentApplicationjsonDocumentationurlMessage`
  ): Responses200748404ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200748404ContentApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200748404ContentApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMakelatest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200748404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
