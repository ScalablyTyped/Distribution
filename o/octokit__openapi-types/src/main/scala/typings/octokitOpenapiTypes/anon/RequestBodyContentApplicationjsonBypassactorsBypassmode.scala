package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBypassactorsBypassmode extends StObject {
  
  var parameters: `639`
  
  /** @description Request body */
  var requestBody: ContentApplicationjsonBypassactorsBypassmode
  
  var responses: `201ContentApplicationjsonRules`
}
object RequestBodyContentApplicationjsonBypassactorsBypassmode {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonBypassactorsBypassmode,
    responses: `201ContentApplicationjsonRules`
  ): RequestBodyContentApplicationjsonBypassactorsBypassmode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBypassactorsBypassmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBypassactorsBypassmode] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypassactorsBypassmode): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
