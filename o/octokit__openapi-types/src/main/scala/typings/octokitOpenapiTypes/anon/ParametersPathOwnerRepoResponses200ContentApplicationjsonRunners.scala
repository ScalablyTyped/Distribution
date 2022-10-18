package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses200ContentApplicationjsonRunners extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200ContentApplicationjsonRunners`
}
object ParametersPathOwnerRepoResponses200ContentApplicationjsonRunners {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200ContentApplicationjsonRunners`): ParametersPathOwnerRepoResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
