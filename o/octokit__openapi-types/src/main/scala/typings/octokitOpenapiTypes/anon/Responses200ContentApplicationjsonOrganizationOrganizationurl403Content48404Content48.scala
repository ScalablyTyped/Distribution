package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48 extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjson370
  
  var responses: `200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48`
}
object Responses200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48 {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjson370,
    responses: `200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48`
  ): Responses200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson370): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationOrganizationurl403Content48404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
