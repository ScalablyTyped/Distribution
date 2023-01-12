package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content580 extends StObject {
  
  var requestBody: ContentApplicationjson359
  
  var responses: `200Content580`
}
object Responses200Content580 {
  
  inline def apply(requestBody: ContentApplicationjson359, responses: `200Content580`): Responses200Content580 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content580]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content580] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjson359): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content580`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
