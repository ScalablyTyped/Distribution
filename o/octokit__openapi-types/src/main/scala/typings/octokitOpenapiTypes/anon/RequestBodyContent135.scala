package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent135 extends StObject {
  
  var parameters: `76`
  
  var requestBody: Content135
  
  var responses: `134`
}
object RequestBodyContent135 {
  
  inline def apply(parameters: `76`, requestBody: Content135, responses: `134`): RequestBodyContent135 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent135]
  }
  
  extension [Self <: RequestBodyContent135](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content135): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `134`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
