package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameRepositoryid extends StObject {
  
  var parameters: PathEnvironmentnameRepositoryid
  
  var responses: `200ContentApplicationjsonSecretsTotalcount`
}
object ParametersPathEnvironmentnameRepositoryid {
  
  inline def apply(
    parameters: PathEnvironmentnameRepositoryid,
    responses: `200ContentApplicationjsonSecretsTotalcount`
  ): ParametersPathEnvironmentnameRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameRepositoryid]
  }
  
  extension [Self <: ParametersPathEnvironmentnameRepositoryid](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecretsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
