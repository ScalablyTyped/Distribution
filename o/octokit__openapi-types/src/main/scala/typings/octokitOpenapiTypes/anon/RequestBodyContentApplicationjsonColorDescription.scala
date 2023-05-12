package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonColorDescription extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonColorDescription
  
  var responses: `201Content289`
}
object RequestBodyContentApplicationjsonColorDescription {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonColorDescription, responses: `201Content289`): RequestBodyContentApplicationjsonColorDescription = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonColorDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonColorDescription] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColorDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content289`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
