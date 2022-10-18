package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent68 extends StObject {
  
  var parameters: PathOrgProjectid
  
  var requestBody: Content68
  
  var responses: `403ContentApplicationjsonDocumentationurlMessage`
}
object RequestBodyContent68 {
  
  inline def apply(
    parameters: PathOrgProjectid,
    requestBody: Content68,
    responses: `403ContentApplicationjsonDocumentationurlMessage`
  ): RequestBodyContent68 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent68]
  }
  
  extension [Self <: RequestBodyContent68](x: Self) {
    
    inline def setParameters(value: PathOrgProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content68): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
