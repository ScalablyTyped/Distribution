package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringQuery extends StObject {
  
  var parameters: PathEnvironmentnameStringQuery
  
  var responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount`
}
object ParametersPathEnvironmentnameStringQuery {
  
  inline def apply(
    parameters: PathEnvironmentnameStringQuery,
    responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount`
  ): ParametersPathEnvironmentnameStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
