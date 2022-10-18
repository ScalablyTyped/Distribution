package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent165 extends StObject {
  
  var parameters: `76`
  
  var requestBody: Content165
  
  var responses: `201409`
}
object RequestBodyContent165 {
  
  inline def apply(parameters: `76`, requestBody: Content165, responses: `201409`): RequestBodyContent165 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent165]
  }
  
  extension [Self <: RequestBodyContent165](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content165): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
