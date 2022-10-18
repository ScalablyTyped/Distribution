package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonExcludegitdata extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonExcludegitdata
  
  var responses: `201ContentApplicationjsonExcludeattachments`
}
object RequestBodyContentApplicationjsonExcludegitdata {
  
  inline def apply(
    parameters: `37`,
    requestBody: ContentApplicationjsonExcludegitdata,
    responses: `201ContentApplicationjsonExcludeattachments`
  ): RequestBodyContentApplicationjsonExcludegitdata = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonExcludegitdata]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonExcludegitdata](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExcludegitdata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExcludeattachments`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
