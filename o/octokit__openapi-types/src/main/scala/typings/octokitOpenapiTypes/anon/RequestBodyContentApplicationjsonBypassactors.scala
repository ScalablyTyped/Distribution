package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBypassactors extends StObject {
  
  var parameters: `55`
  
  /** @description Request body */
  var requestBody: ContentApplicationjsonBypassactors
  
  var responses: `201404500`
}
object RequestBodyContentApplicationjsonBypassactors {
  
  inline def apply(parameters: `55`, requestBody: ContentApplicationjsonBypassactors, responses: `201404500`): RequestBodyContentApplicationjsonBypassactors = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBypassactors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBypassactors] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypassactors): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
