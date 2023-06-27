package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonComment extends StObject {
  
  var parameters: `181`
  
  var requestBody: ContentApplicationjsonComment
  
  var responses: `200Content188`
}
object RequestBodyContentApplicationjsonComment {
  
  inline def apply(parameters: `181`, requestBody: ContentApplicationjsonComment, responses: `200Content188`): RequestBodyContentApplicationjsonComment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonComment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `181`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content188`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
