package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonCreditsCveid extends StObject {
  
  var parameters: PathGhsaidOwner
  
  var requestBody: ContentApplicationjsonCreditsCveid
  
  var responses: `422ContentApplicationjsonDocumentationurlErrorsMessage`
}
object RequestBodyContentApplicationjsonCreditsCveid {
  
  inline def apply(
    parameters: PathGhsaidOwner,
    requestBody: ContentApplicationjsonCreditsCveid,
    responses: `422ContentApplicationjsonDocumentationurlErrorsMessage`
  ): RequestBodyContentApplicationjsonCreditsCveid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonCreditsCveid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonCreditsCveid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGhsaidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCreditsCveid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurlErrorsMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
