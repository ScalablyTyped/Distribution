package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent521 extends StObject {
  
  var parameters: `472`
  
  var requestBody: Content521
  
  var responses: `201ContentApplicationjsonPingurl`
}
object RequestBodyContent521 {
  
  inline def apply(parameters: `472`, requestBody: Content521, responses: `201ContentApplicationjsonPingurl`): RequestBodyContent521 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent521]
  }
  
  extension [Self <: RequestBodyContent521](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content521): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonPingurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
