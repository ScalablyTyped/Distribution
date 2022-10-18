package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content509 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonMessageObject
  
  var responses: `201Content509`
}
object Responses201Content509 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonMessageObject, responses: `201Content509`): Responses201Content509 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content509]
  }
  
  extension [Self <: Responses201Content509](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMessageObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content509`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
