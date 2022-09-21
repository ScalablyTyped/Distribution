package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200572404ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjsonPrerelease
  
  var responses: `200572404ContentApplicationjsonDocumentationurlMessage`
}
object Responses200572404ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjsonPrerelease,
    responses: `200572404ContentApplicationjsonDocumentationurlMessage`
  ): Responses200572404ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200572404ContentApplicationjsonDocumentationurlMessage]
  }
  
  extension [Self <: Responses200572404ContentApplicationjsonDocumentationurlMessage](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrerelease): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200572404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
