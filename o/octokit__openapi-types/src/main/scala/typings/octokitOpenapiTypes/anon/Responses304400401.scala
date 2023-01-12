package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304400401 extends StObject {
  
  var requestBody: ContentApplicationjsonAllowmergecommit
  
  var responses: `304400401`
}
object Responses304400401 {
  
  inline def apply(requestBody: ContentApplicationjsonAllowmergecommit, responses: `304400401`): Responses304400401 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304400401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304400401] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAllowmergecommit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
