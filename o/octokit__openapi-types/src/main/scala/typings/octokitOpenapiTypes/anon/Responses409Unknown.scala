package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409Unknown extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjson13
  
  var responses: `409Unknown`
}
object Responses409Unknown {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjson13, responses: `409Unknown`): Responses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409Unknown]
  }
  
  extension [Self <: Responses409Unknown](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson13): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
