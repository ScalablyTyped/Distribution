package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content537 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonKeyReadonly
  
  var responses: `201Content537`
}
object Responses201Content537 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonKeyReadonly, responses: `201Content537`): Responses201Content537 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content537]
  }
  
  extension [Self <: Responses201Content537](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyReadonly): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content537`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
