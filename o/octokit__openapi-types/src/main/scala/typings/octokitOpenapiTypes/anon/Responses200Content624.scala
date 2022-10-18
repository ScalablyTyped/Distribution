package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content624 extends StObject {
  
  var requestBody: ContentApplicationjson199
  
  var responses: `200Content624`
}
object Responses200Content624 {
  
  inline def apply(requestBody: ContentApplicationjson199, responses: `200Content624`): Responses200Content624 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content624]
  }
  
  extension [Self <: Responses200Content624](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjson199): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content624`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
