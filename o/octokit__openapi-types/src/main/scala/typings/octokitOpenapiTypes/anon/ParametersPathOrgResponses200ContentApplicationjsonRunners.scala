package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses200ContentApplicationjsonRunners extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200ContentApplicationjsonRunners`
}
object ParametersPathOrgResponses200ContentApplicationjsonRunners {
  
  inline def apply(parameters: PathOrg, responses: `200ContentApplicationjsonRunners`): ParametersPathOrgResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: ParametersPathOrgResponses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
