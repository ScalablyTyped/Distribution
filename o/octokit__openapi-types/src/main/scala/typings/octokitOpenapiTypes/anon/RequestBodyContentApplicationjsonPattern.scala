package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPattern extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonPattern
  
  var responses: `201Content335`
}
object RequestBodyContentApplicationjsonPattern {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonPattern, responses: `201Content335`): RequestBodyContentApplicationjsonPattern = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPattern]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPattern](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPattern): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content335`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
