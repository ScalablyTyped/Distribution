package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrganizationOrganizationurl403Content41 extends StObject {
  
  var parameters: PathUsernameString
  
  var requestBody: js.UndefOr[ContentApplicationjson105] = js.undefined
  
  var responses: `200ContentApplicationjsonOrganizationOrganizationurl403Content41`
}
object Responses200ContentApplicationjsonOrganizationOrganizationurl403Content41 {
  
  inline def apply(
    parameters: PathUsernameString,
    responses: `200ContentApplicationjsonOrganizationOrganizationurl403Content41`
  ): Responses200ContentApplicationjsonOrganizationOrganizationurl403Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrganizationOrganizationurl403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonOrganizationOrganizationurl403Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson105): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationOrganizationurl403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
