package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent540 extends StObject {
  
  var parameters: `491`
  
  var requestBody: Content540
  
  var responses: `201ContentApplicationjsonPingurl`
}
object RequestBodyContent540 {
  
  inline def apply(parameters: `491`, requestBody: Content540, responses: `201ContentApplicationjsonPingurl`): RequestBodyContent540 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent540]
  }
  
  extension [Self <: RequestBodyContent540](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content540): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonPingurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
