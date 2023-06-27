package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonActive extends StObject {
  
  var parameters: `55`
  
  var requestBody: ContentApplicationjsonActive
  
  var responses: `201Content92`
}
object RequestBodyContentApplicationjsonActive {
  
  inline def apply(parameters: `55`, requestBody: ContentApplicationjsonActive, responses: `201Content92`): RequestBodyContentApplicationjsonActive = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonActive] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonActive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content92`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
