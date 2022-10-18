package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content624 extends StObject {
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `201Content624`
}
object Responses201Content624 {
  
  inline def apply(requestBody: ContentApplicationjsonEmails, responses: `201Content624`): Responses201Content624 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content624]
  }
  
  extension [Self <: Responses201Content624](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content624`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
