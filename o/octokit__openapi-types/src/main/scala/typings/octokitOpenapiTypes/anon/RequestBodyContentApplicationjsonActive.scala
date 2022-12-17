package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonActive extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonActive
  
  var responses: `201Content76`
}
object RequestBodyContentApplicationjsonActive {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjsonActive, responses: `201Content76`): RequestBodyContentApplicationjsonActive = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonActive]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonActive](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonActive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content76`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
