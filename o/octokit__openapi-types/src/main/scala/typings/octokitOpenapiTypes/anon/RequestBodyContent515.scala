package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent515 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content515
  
  var responses: `201Content514`
}
object RequestBodyContent515 {
  
  inline def apply(parameters: `395`, requestBody: Content515, responses: `201Content514`): RequestBodyContent515 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent515]
  }
  
  extension [Self <: RequestBodyContent515](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content515): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content514`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
