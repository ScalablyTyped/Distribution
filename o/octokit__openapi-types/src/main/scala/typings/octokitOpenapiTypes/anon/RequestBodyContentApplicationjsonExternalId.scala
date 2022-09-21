package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonExternalId extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjsonExternalId
  
  var responses: `304400`
}
object RequestBodyContentApplicationjsonExternalId {
  
  inline def apply(parameters: PathOrg, requestBody: ContentApplicationjsonExternalId, responses: `304400`): RequestBodyContentApplicationjsonExternalId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonExternalId]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonExternalId](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExternalId): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
