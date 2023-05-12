package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonComment extends StObject {
  
  var parameters: `154`
  
  var requestBody: ContentApplicationjsonComment
  
  var responses: `200Content160`
}
object RequestBodyContentApplicationjsonComment {
  
  inline def apply(parameters: `154`, requestBody: ContentApplicationjsonComment, responses: `200Content160`): RequestBodyContentApplicationjsonComment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonComment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `154`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content160`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
