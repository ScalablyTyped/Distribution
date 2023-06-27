package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBypassmode extends StObject {
  
  var parameters: `165`
  
  /** @description Request body */
  var requestBody: ContentApplicationjsonBypassmode
  
  var responses: `201404500`
}
object RequestBodyContentApplicationjsonBypassmode {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonBypassmode, responses: `201404500`): RequestBodyContentApplicationjsonBypassmode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBypassmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBypassmode] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypassmode): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
