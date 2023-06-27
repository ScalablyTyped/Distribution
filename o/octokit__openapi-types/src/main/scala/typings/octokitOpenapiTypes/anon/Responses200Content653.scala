package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content653 extends StObject {
  
  var parameters: `645`
  
  var requestBody: ContentApplicationjsonComment
  
  var responses: `200Content653`
}
object Responses200Content653 {
  
  inline def apply(parameters: `645`, requestBody: ContentApplicationjsonComment, responses: `200Content653`): Responses200Content653 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content653]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content653] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `645`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content653`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
