package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonComment extends StObject {
  
  var parameters: `147`
  
  var requestBody: ContentApplicationjsonComment
  
  var responses: `200Content152`
}
object RequestBodyContentApplicationjsonComment {
  
  inline def apply(parameters: `147`, requestBody: ContentApplicationjsonComment, responses: `200Content152`): RequestBodyContentApplicationjsonComment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonComment]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonComment](x: Self) {
    
    inline def setParameters(value: `147`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content152`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
