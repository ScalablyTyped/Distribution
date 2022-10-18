package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content4304 extends StObject {
  
  var parameters: Path386
  
  var requestBody: ContentApplicationjsonPosition
  
  var responses: `201Content4304`
}
object Responses201Content4304 {
  
  inline def apply(parameters: Path386, requestBody: ContentApplicationjsonPosition, responses: `201Content4304`): Responses201Content4304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content4304]
  }
  
  extension [Self <: Responses201Content4304](x: Self) {
    
    inline def setParameters(value: Path386): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPosition): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
