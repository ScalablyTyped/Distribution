package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Unknown404 extends StObject {
  
  var parameters: Path610
  
  var requestBody: ContentApplicationjson64
  
  var responses: `403Unknown404`
}
object Responses403Unknown404 {
  
  inline def apply(parameters: Path610, requestBody: ContentApplicationjson64, responses: `403Unknown404`): Responses403Unknown404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Unknown404]
  }
  
  extension [Self <: Responses403Unknown404](x: Self) {
    
    inline def setParameters(value: Path610): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson64): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Unknown404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
