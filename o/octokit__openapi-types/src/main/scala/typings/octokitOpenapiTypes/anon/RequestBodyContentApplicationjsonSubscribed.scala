package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSubscribed extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonSubscribed
  
  var responses: `337`
}
object RequestBodyContentApplicationjsonSubscribed {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonSubscribed, responses: `337`): RequestBodyContentApplicationjsonSubscribed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSubscribed]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSubscribed](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `337`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
