package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrg extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200ContentApplicationjsonSecrets`
}
object ParametersPathOrg {
  
  inline def apply(parameters: PathOrg, responses: `200ContentApplicationjsonSecrets`): ParametersPathOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrg]
  }
  
  extension [Self <: ParametersPathOrg](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecrets`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
