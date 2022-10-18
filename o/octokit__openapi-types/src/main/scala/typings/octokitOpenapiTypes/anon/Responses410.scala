package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses410 extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `410`
}
object Responses410 {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonBodyNameString, responses: `410`): Responses410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses410]
  }
  
  extension [Self <: Responses410](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
