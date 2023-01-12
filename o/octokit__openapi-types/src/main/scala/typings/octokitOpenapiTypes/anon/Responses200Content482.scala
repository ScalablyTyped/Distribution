package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content482 extends StObject {
  
  var parameters: `475`
  
  var requestBody: ContentApplicationjsonComment
  
  var responses: `200Content482`
}
object Responses200Content482 {
  
  inline def apply(parameters: `475`, requestBody: ContentApplicationjsonComment, responses: `200Content482`): Responses200Content482 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content482]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content482] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `475`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
