package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonExpiryLimit extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonExpiryLimit
  
  var responses: `200ContentApplicationjsonOrigin`
}
object RequestBodyContentApplicationjsonExpiryLimit {
  
  inline def apply(
    parameters: `582`,
    requestBody: ContentApplicationjsonExpiryLimit,
    responses: `200ContentApplicationjsonOrigin`
  ): RequestBodyContentApplicationjsonExpiryLimit = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonExpiryLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonExpiryLimit] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExpiryLimit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrigin`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
