package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonEnabledId extends StObject {
  
  var parameters: PathEnvironmentnameString
  
  var requestBody: ContentApplicationjsonIntegrationid
  
  var responses: `201ContentApplicationjsonEnabledId`
}
object Responses201ContentApplicationjsonEnabledId {
  
  inline def apply(
    parameters: PathEnvironmentnameString,
    requestBody: ContentApplicationjsonIntegrationid,
    responses: `201ContentApplicationjsonEnabledId`
  ): Responses201ContentApplicationjsonEnabledId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonEnabledId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonEnabledId] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIntegrationid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonEnabledId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
