package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrigin extends StObject {
  
  var requestBody: ContentApplicationjsonExpiryLimit
  
  var responses: `200ContentApplicationjsonOrigin`
}
object Responses200ContentApplicationjsonOrigin {
  
  inline def apply(requestBody: ContentApplicationjsonExpiryLimit, responses: `200ContentApplicationjsonOrigin`): Responses200ContentApplicationjsonOrigin = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonOrigin] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonExpiryLimit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrigin`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
