package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrigin409Unknown extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonExpiryLimit
  
  var responses: `200ContentApplicationjsonOrigin409Unknown`
}
object Responses200ContentApplicationjsonOrigin409Unknown {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonExpiryLimit,
    responses: `200ContentApplicationjsonOrigin409Unknown`
  ): Responses200ContentApplicationjsonOrigin409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrigin409Unknown]
  }
  
  extension [Self <: Responses200ContentApplicationjsonOrigin409Unknown](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExpiryLimit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrigin409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
