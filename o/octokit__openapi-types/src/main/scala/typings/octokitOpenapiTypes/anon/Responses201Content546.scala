package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content546 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonDueon
  
  var responses: `201Content546`
}
object Responses201Content546 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonDueon, responses: `201Content546`): Responses201Content546 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content546]
  }
  
  extension [Self <: Responses201Content546](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content546`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
