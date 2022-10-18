package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNewowner extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonNewowner
  
  var responses: `202ContentApplicationjsonBlobsurl`
}
object RequestBodyContentApplicationjsonNewowner {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonNewowner,
    responses: `202ContentApplicationjsonBlobsurl`
  ): RequestBodyContentApplicationjsonNewowner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNewowner]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNewowner](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewowner): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202ContentApplicationjsonBlobsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
