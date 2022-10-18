package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content598 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonNewowner
  
  var responses: `202Content598`
}
object Responses202Content598 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonNewowner, responses: `202Content598`): Responses202Content598 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content598]
  }
  
  extension [Self <: Responses202Content598](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewowner): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content598`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
