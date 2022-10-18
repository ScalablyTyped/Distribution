package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content344403404 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjson213
  
  var responses: `200Content344403404`
}
object Responses200Content344403404 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjson213, responses: `200Content344403404`): Responses200Content344403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content344403404]
  }
  
  extension [Self <: Responses200Content344403404](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson213): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content344403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
