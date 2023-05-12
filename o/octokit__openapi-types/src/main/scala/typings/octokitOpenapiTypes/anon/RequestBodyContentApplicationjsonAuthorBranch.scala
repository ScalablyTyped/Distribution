package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAuthorBranch extends StObject {
  
  var parameters: `222`
  
  var requestBody: ContentApplicationjsonAuthorBranch
  
  var responses: `200404409`
}
object RequestBodyContentApplicationjsonAuthorBranch {
  
  inline def apply(parameters: `222`, requestBody: ContentApplicationjsonAuthorBranch, responses: `200404409`): RequestBodyContentApplicationjsonAuthorBranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAuthorBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAuthorBranch] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `222`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAuthorBranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
