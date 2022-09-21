package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAuthorBranch extends StObject {
  
  var parameters: `219`
  
  var requestBody: ContentApplicationjsonAuthorBranch
  
  var responses: `409422`
}
object RequestBodyContentApplicationjsonAuthorBranch {
  
  inline def apply(parameters: `219`, requestBody: ContentApplicationjsonAuthorBranch, responses: `409422`): RequestBodyContentApplicationjsonAuthorBranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAuthorBranch]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAuthorBranch](x: Self) {
    
    inline def setParameters(value: `219`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAuthorBranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
