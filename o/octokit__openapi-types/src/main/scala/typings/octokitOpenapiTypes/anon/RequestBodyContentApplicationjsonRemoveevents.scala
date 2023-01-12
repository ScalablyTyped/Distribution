package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRemoveevents extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var requestBody: ContentApplicationjsonRemoveevents
  
  var responses: `200522404Content48`
}
object RequestBodyContentApplicationjsonRemoveevents {
  
  inline def apply(
    parameters: PathHookidOwnerRepo,
    requestBody: ContentApplicationjsonRemoveevents,
    responses: `200522404Content48`
  ): RequestBodyContentApplicationjsonRemoveevents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRemoveevents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonRemoveevents] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRemoveevents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200522404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
