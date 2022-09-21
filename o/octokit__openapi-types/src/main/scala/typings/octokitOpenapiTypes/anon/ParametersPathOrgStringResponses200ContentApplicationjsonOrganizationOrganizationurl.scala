package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonOrganizationOrganizationurl extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonOrganizationOrganizationurl`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonOrganizationOrganizationurl {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonOrganizationOrganizationurl`): ParametersPathOrgStringResponses200ContentApplicationjsonOrganizationOrganizationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonOrganizationOrganizationurl]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonOrganizationOrganizationurl](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationOrganizationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
