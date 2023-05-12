package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonResolutionResolutioncomment extends StObject {
  
  var parameters: PathAlertnumberOwnerRepo
  
  var requestBody: ContentApplicationjsonResolutionResolutioncomment
  
  var responses: `200ContentApplicationjsonPushprotectionbypassedat`
}
object RequestBodyContentApplicationjsonResolutionResolutioncomment {
  
  inline def apply(
    parameters: PathAlertnumberOwnerRepo,
    requestBody: ContentApplicationjsonResolutionResolutioncomment,
    responses: `200ContentApplicationjsonPushprotectionbypassedat`
  ): RequestBodyContentApplicationjsonResolutionResolutioncomment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonResolutionResolutioncomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonResolutionResolutioncomment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonResolutionResolutioncomment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonPushprotectionbypassedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
