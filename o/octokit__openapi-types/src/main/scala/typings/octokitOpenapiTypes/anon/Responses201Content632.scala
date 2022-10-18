package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content632 extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201Content632`
}
object Responses201Content632 {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201Content632`): Responses201Content632 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content632]
  }
  
  extension [Self <: Responses201Content632](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content632`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
