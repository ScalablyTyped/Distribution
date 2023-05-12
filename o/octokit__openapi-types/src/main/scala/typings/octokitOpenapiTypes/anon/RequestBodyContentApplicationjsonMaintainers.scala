package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonMaintainers extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonMaintainers
  
  var responses: `201Content113`
}
object RequestBodyContentApplicationjsonMaintainers {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjsonMaintainers, responses: `201Content113`): RequestBodyContentApplicationjsonMaintainers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonMaintainers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonMaintainers] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
