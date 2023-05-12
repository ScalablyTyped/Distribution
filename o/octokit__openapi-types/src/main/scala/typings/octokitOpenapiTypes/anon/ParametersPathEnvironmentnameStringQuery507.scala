package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringQuery507 extends StObject {
  
  var parameters: PathEnvironmentnameStringQuery507
  
  var responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount`
}
object ParametersPathEnvironmentnameStringQuery507 {
  
  inline def apply(
    parameters: PathEnvironmentnameStringQuery507,
    responses: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount`
  ): ParametersPathEnvironmentnameStringQuery507 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringQuery507] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringQuery507): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
