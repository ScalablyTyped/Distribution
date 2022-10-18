package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses588 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonSubscribed
  
  var responses: `588`
}
object Responses588 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonSubscribed, responses: `588`): Responses588 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses588]
  }
  
  extension [Self <: Responses588](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `588`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
