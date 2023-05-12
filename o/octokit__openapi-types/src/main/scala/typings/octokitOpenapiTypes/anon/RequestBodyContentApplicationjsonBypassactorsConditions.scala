package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBypassactorsConditions extends StObject {
  
  var parameters: `496`
  
  /** @description Request body */
  var requestBody: ContentApplicationjsonBypassactorsConditions
  
  var responses: `201ContentApplicationjsonRules`
}
object RequestBodyContentApplicationjsonBypassactorsConditions {
  
  inline def apply(
    parameters: `496`,
    requestBody: ContentApplicationjsonBypassactorsConditions,
    responses: `201ContentApplicationjsonRules`
  ): RequestBodyContentApplicationjsonBypassactorsConditions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBypassactorsConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBypassactorsConditions] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypassactorsConditions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
