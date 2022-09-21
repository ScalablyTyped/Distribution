package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidQuery426 extends StObject {
  
  var parameters: PathEnterpriseRunnergroupidQuery426
  
  var responses: `200ContentApplicationjsonOrganizationsTotalcount`
}
object ParametersPathEnterpriseRunnergroupidQuery426 {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupidQuery426,
    responses: `200ContentApplicationjsonOrganizationsTotalcount`
  ): ParametersPathEnterpriseRunnergroupidQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidQuery426]
  }
  
  extension [Self <: ParametersPathEnterpriseRunnergroupidQuery426](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupidQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
