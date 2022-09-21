package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `200ContentApplicationjsonRunners`
}
object ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `200ContentApplicationjsonRunners`): ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
