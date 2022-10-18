package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content648 extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201Content648`
}
object Responses201Content648 {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201Content648`): Responses201Content648 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content648]
  }
  
  extension [Self <: Responses201Content648](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content648`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
