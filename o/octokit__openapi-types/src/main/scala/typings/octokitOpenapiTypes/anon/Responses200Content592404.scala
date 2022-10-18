package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content592404 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonNames
  
  var responses: `200Content592404`
}
object Responses200Content592404 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonNames, responses: `200Content592404`): Responses200Content592404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content592404]
  }
  
  extension [Self <: Responses200Content592404](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNames): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
