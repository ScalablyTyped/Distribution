package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent512 extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var requestBody: Content512
  
  var responses: `422ContentApplicationjsonDocumentationurlMessage`
}
object RequestBodyContent512 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwner,
    requestBody: Content512,
    responses: `422ContentApplicationjsonDocumentationurlMessage`
  ): RequestBodyContent512 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent512]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent512] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content512): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
