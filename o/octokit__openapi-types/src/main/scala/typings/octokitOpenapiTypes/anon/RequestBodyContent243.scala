package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent243 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content243
  
  var responses: `201Content242`
}
object RequestBodyContent243 {
  
  inline def apply(parameters: `135`, requestBody: Content243, responses: `201Content242`): RequestBodyContent243 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent243]
  }
  
  extension [Self <: RequestBodyContent243](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content243): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content242`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
