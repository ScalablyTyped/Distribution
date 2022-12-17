package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content580 extends StObject {
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `201Content580`
}
object Responses201Content580 {
  
  inline def apply(requestBody: ContentApplicationjsonEmails, responses: `201Content580`): Responses201Content580 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content580]
  }
  
  extension [Self <: Responses201Content580](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content580`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
