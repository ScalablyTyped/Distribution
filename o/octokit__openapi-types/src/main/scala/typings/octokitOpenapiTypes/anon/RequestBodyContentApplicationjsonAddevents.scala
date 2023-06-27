package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAddevents extends StObject {
  
  var parameters: PathHookidOwner
  
  var requestBody: ContentApplicationjsonAddevents
  
  var responses: `200305404`
}
object RequestBodyContentApplicationjsonAddevents {
  
  inline def apply(parameters: PathHookidOwner, requestBody: ContentApplicationjsonAddevents, responses: `200305404`): RequestBodyContentApplicationjsonAddevents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAddevents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAddevents] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAddevents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200305404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
