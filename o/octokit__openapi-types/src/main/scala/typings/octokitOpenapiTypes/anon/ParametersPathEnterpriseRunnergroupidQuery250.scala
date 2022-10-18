package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidQuery250 extends StObject {
  
  var parameters: PathEnterpriseRunnergroupidQuery250
  
  var responses: `200ContentApplicationjsonOrganizationsTotalcount`
}
object ParametersPathEnterpriseRunnergroupidQuery250 {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupidQuery250,
    responses: `200ContentApplicationjsonOrganizationsTotalcount`
  ): ParametersPathEnterpriseRunnergroupidQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidQuery250]
  }
  
  extension [Self <: ParametersPathEnterpriseRunnergroupidQuery250](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupidQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
