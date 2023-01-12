package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200553404ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjsonPrerelease
  
  var responses: `200553404ContentApplicationjsonDocumentationurlMessage`
}
object Responses200553404ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjsonPrerelease,
    responses: `200553404ContentApplicationjsonDocumentationurlMessage`
  ): Responses200553404ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200553404ContentApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200553404ContentApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrerelease): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200553404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
