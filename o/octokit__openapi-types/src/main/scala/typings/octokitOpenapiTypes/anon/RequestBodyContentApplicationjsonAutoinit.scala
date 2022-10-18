package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAutoinit extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonAutoinit
  
  var responses: `201403`
}
object RequestBodyContentApplicationjsonAutoinit {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonAutoinit, responses: `201403`): RequestBodyContentApplicationjsonAutoinit = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAutoinit]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAutoinit](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutoinit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
