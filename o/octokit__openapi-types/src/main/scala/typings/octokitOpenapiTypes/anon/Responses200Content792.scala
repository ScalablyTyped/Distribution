package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content792 extends StObject {
  
  var requestBody: ContentApplicationjson456
  
  var responses: `200Content792`
}
object Responses200Content792 {
  
  inline def apply(requestBody: ContentApplicationjson456, responses: `200Content792`): Responses200Content792 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content792]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content792] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjson456): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content792`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
