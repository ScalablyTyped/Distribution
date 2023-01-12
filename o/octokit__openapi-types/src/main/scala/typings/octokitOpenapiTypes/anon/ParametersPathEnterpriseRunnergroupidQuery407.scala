package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidQuery407 extends StObject {
  
  var parameters: PathEnterpriseRunnergroupidQuery407
  
  var responses: `200ContentApplicationjsonOrganizationsTotalcount`
}
object ParametersPathEnterpriseRunnergroupidQuery407 {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupidQuery407,
    responses: `200ContentApplicationjsonOrganizationsTotalcount`
  ): ParametersPathEnterpriseRunnergroupidQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseRunnergroupidQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseRunnergroupidQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
