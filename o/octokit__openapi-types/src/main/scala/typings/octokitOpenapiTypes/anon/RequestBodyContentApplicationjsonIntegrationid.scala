package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIntegrationid extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var requestBody: ContentApplicationjsonIntegrationid
  
  var responses: `201Content285`
}
object RequestBodyContentApplicationjsonIntegrationid {
  
  inline def apply(
    parameters: PathEnvironmentnameOwner,
    requestBody: ContentApplicationjsonIntegrationid,
    responses: `201Content285`
  ): RequestBodyContentApplicationjsonIntegrationid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIntegrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonIntegrationid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIntegrationid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content285`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
