package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowspublicrepositoriesName extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonAllowspublicrepositoriesName
  
  var responses: `201ContentApplicationjsonDefault`
}
object RequestBodyContentApplicationjsonAllowspublicrepositoriesName {
  
  inline def apply(
    parameters: `37`,
    requestBody: ContentApplicationjsonAllowspublicrepositoriesName,
    responses: `201ContentApplicationjsonDefault`
  ): RequestBodyContentApplicationjsonAllowspublicrepositoriesName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowspublicrepositoriesName]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAllowspublicrepositoriesName](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowspublicrepositoriesName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDefault`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
