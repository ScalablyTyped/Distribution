package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content426 extends StObject {
  
  var parameters: `418`
  
  var requestBody: ContentApplicationjsonEnvironmentids
  
  var responses: `200Content426`
}
object Responses200Content426 {
  
  inline def apply(parameters: `418`, requestBody: ContentApplicationjsonEnvironmentids, responses: `200Content426`): Responses200Content426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content426]
  }
  
  extension [Self <: Responses200Content426](x: Self) {
    
    inline def setParameters(value: `418`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEnvironmentids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content426`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
