package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerQuery extends StObject {
  
  var parameters: PathEnvironmentnameOwnerQuery
  
  var responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`
}
object ParametersPathEnvironmentnameOwnerQuery {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerQuery,
    responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`
  ): ParametersPathEnvironmentnameOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
