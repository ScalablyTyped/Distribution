package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content603 extends StObject {
  
  var requestBody: ContentApplicationjsonVisibility
  
  var responses: `200Content603`
}
object Responses200Content603 {
  
  inline def apply(requestBody: ContentApplicationjsonVisibility, responses: `200Content603`): Responses200Content603 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content603]
  }
  
  extension [Self <: Responses200Content603](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content603`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
