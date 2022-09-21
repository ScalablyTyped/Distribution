package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters495RequestBodyContent152 extends StObject {
  
  var parameters: `495`
  
  var requestBody: Content152
  
  var responses: `201Content47`
}
object Parameters495RequestBodyContent152 {
  
  inline def apply(parameters: `495`, requestBody: Content152, responses: `201Content47`): Parameters495RequestBodyContent152 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters495RequestBodyContent152]
  }
  
  extension [Self <: Parameters495RequestBodyContent152](x: Self) {
    
    inline def setParameters(value: `495`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content152): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
