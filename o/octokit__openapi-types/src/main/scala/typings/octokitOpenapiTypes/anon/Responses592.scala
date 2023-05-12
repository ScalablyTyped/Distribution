package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses592 extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonExpiryLimit
  
  var responses: `592`
}
object Responses592 {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonExpiryLimit, responses: `592`): Responses592 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses592]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses592] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExpiryLimit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `592`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
