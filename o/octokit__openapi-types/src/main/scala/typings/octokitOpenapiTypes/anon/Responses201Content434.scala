package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content434 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonKeyprefix
  
  var responses: `201Content434`
}
object Responses201Content434 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonKeyprefix, responses: `201Content434`): Responses201Content434 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content434]
  }
  
  extension [Self <: Responses201Content434](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyprefix): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content434`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
