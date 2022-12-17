package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonColorDescription extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonColorDescription
  
  var responses: `201Content274`
}
object RequestBodyContentApplicationjsonColorDescription {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonColorDescription, responses: `201Content274`): RequestBodyContentApplicationjsonColorDescription = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonColorDescription]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonColorDescription](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColorDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content274`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
