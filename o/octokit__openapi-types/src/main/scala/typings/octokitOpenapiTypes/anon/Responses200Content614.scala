package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content614 extends StObject {
  
  var requestBody: ContentApplicationjsonHireable
  
  var responses: `200Content614`
}
object Responses200Content614 {
  
  inline def apply(requestBody: ContentApplicationjsonHireable, responses: `200Content614`): Responses200Content614 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content614]
  }
  
  extension [Self <: Responses200Content614](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonHireable): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content614`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
