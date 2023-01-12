package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSubscribed extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonSubscribed
  
  var responses: `332`
}
object RequestBodyContentApplicationjsonSubscribed {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonSubscribed, responses: `332`): RequestBodyContentApplicationjsonSubscribed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSubscribed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonSubscribed] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `332`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
