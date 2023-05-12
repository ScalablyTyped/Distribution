package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBase extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonBase
  
  var responses: `201Content217`
}
object RequestBodyContentApplicationjsonBase {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonBase, responses: `201Content217`): RequestBodyContentApplicationjsonBase = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBase] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBase): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content217`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
