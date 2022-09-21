package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content603 extends StObject {
  
  var requestBody: ContentApplicationjsonEmailsArray
  
  var responses: `201Content603`
}
object Responses201Content603 {
  
  inline def apply(requestBody: ContentApplicationjsonEmailsArray, responses: `201Content603`): Responses201Content603 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content603]
  }
  
  extension [Self <: Responses201Content603](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmailsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content603`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
