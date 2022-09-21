package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content390 extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201Content390`
}
object Responses201Content390 {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201Content390`): Responses201Content390 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content390]
  }
  
  extension [Self <: Responses201Content390](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content390`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
