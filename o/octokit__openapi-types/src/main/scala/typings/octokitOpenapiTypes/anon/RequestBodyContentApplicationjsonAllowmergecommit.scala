package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowmergecommit extends StObject {
  
  var requestBody: ContentApplicationjsonAllowmergecommit
  
  var responses: `201304400`
}
object RequestBodyContentApplicationjsonAllowmergecommit {
  
  inline def apply(requestBody: ContentApplicationjsonAllowmergecommit, responses: `201304400`): RequestBodyContentApplicationjsonAllowmergecommit = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowmergecommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAllowmergecommit] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAllowmergecommit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
