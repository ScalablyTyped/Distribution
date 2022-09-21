package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent531 extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var requestBody: Content531
  
  var responses: `422ContentApplicationjsonDocumentationurlMessage`
}
object RequestBodyContent531 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwner,
    requestBody: Content531,
    responses: `422ContentApplicationjsonDocumentationurlMessage`
  ): RequestBodyContent531 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent531]
  }
  
  extension [Self <: RequestBodyContent531](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content531): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
