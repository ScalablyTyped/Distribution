package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOrganizationOrganizationurl403Content55 extends StObject {
  
  var parameters: PathUsernameString
  
  var requestBody: ContentApplicationjson95
  
  var responses: `200ContentApplicationjsonOrganizationOrganizationurl403Content55`
}
object Responses200ContentApplicationjsonOrganizationOrganizationurl403Content55 {
  
  inline def apply(
    parameters: PathUsernameString,
    requestBody: ContentApplicationjson95,
    responses: `200ContentApplicationjsonOrganizationOrganizationurl403Content55`
  ): Responses200ContentApplicationjsonOrganizationOrganizationurl403Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOrganizationOrganizationurl403Content55]
  }
  
  extension [Self <: Responses200ContentApplicationjsonOrganizationOrganizationurl403Content55](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson95): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationOrganizationurl403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
