package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent98 extends StObject {
  
  var parameters: `76`
  
  var requestBody: Content98
  
  var responses: `201ContentApplicationjsonConclusion`
}
object RequestBodyContent98 {
  
  inline def apply(parameters: `76`, requestBody: Content98, responses: `201ContentApplicationjsonConclusion`): RequestBodyContent98 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent98]
  }
  
  extension [Self <: RequestBodyContent98](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content98): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonConclusion`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
