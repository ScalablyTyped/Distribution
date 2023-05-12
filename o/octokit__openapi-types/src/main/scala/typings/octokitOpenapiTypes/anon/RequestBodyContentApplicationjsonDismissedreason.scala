package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDismissedreason extends StObject {
  
  var parameters: PathAlertnumberOwner
  
  var requestBody: ContentApplicationjsonDismissedreason
  
  var responses: `200400403`
}
object RequestBodyContentApplicationjsonDismissedreason {
  
  inline def apply(
    parameters: PathAlertnumberOwner,
    requestBody: ContentApplicationjsonDismissedreason,
    responses: `200400403`
  ): RequestBodyContentApplicationjsonDismissedreason = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDismissedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDismissedreason] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDismissedreason): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
