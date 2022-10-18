package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTfvcproject extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonTfvcproject
  
  var responses: `201ContentApplicationjsonAuthorscountHeadersLocation`
}
object RequestBodyContentApplicationjsonTfvcproject {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonTfvcproject,
    responses: `201ContentApplicationjsonAuthorscountHeadersLocation`
  ): RequestBodyContentApplicationjsonTfvcproject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTfvcproject]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonTfvcproject](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTfvcproject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAuthorscountHeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
