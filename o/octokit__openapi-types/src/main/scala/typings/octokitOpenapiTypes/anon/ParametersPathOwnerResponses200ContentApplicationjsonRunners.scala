package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses200ContentApplicationjsonRunners extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200ContentApplicationjsonRunners`
}
object ParametersPathOwnerResponses200ContentApplicationjsonRunners {
  
  inline def apply(parameters: PathOwner, responses: `200ContentApplicationjsonRunners`): ParametersPathOwnerResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: ParametersPathOwnerResponses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
