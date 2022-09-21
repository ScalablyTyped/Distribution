package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content67 extends StObject {
  
  var parameters: `157`
  
  var requestBody: Content152
  
  var responses: `201Content67`
}
object Responses201Content67 {
  
  inline def apply(parameters: `157`, requestBody: Content152, responses: `201Content67`): Responses201Content67 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content67]
  }
  
  extension [Self <: Responses201Content67](x: Self) {
    
    inline def setParameters(value: `157`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content152): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content67`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
