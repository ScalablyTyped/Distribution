package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTfvcproject extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonTfvcproject
  
  var responses: `201Content252HeadersLocation`
}
object RequestBodyContentApplicationjsonTfvcproject {
  
  inline def apply(
    parameters: `144`,
    requestBody: ContentApplicationjsonTfvcproject,
    responses: `201Content252HeadersLocation`
  ): RequestBodyContentApplicationjsonTfvcproject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTfvcproject]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonTfvcproject](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTfvcproject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content252HeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
