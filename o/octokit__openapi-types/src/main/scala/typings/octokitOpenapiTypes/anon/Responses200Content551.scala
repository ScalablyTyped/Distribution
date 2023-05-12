package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content551 extends StObject {
  
  var parameters: `544`
  
  var requestBody: ContentApplicationjsonComment
  
  var responses: `200Content551`
}
object Responses200Content551 {
  
  inline def apply(parameters: `544`, requestBody: ContentApplicationjsonComment, responses: `200Content551`): Responses200Content551 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content551]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content551] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `544`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content551`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
