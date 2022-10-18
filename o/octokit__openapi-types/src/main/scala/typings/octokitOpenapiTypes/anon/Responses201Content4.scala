package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content4 extends StObject {
  
  var parameters: `80`
  
  var requestBody: Content79
  
  var responses: `201Content4`
}
object Responses201Content4 {
  
  inline def apply(parameters: `80`, requestBody: Content79, responses: `201Content4`): Responses201Content4 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content4]
  }
  
  extension [Self <: Responses201Content4](x: Self) {
    
    inline def setParameters(value: `80`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content79): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
