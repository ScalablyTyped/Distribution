package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses710 extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonExpiryLimit
  
  var responses: `710`
}
object Responses710 {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjsonExpiryLimit, responses: `710`): Responses710 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses710]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses710] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExpiryLimit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `710`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
