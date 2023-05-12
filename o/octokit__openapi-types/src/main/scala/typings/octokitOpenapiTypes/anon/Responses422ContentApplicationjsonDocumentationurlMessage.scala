package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathEnvironmentnameOwnerRepo
  
  var requestBody: js.UndefOr[Content579] = js.undefined
  
  var responses: `422ContentApplicationjsonDocumentationurlMessage`
}
object Responses422ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerRepo,
    responses: `422ContentApplicationjsonDocumentationurlMessage`
  ): Responses422ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422ContentApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses422ContentApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content579): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
