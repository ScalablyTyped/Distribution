package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent108 extends StObject {
  
  var parameters: `76`
  
  var requestBody: Content108
  
  var responses: `201202`
}
object RequestBodyContent108 {
  
  inline def apply(parameters: `76`, requestBody: Content108, responses: `201202`): RequestBodyContent108 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent108]
  }
  
  extension [Self <: RequestBodyContent108](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content108): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
