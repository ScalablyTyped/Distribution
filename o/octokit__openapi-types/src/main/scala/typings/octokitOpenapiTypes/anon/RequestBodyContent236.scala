package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent236 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content236
  
  var responses: `202400`
}
object RequestBodyContent236 {
  
  inline def apply(parameters: `144`, requestBody: Content236, responses: `202400`): RequestBodyContent236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent236]
  }
  
  extension [Self <: RequestBodyContent236](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content236): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
