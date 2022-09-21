package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGroupidOrg extends StObject {
  
  var parameters: PathGroupidOrg
  
  var responses: `200ContentApplicationjsonMembers`
}
object ParametersPathGroupidOrg {
  
  inline def apply(parameters: PathGroupidOrg, responses: `200ContentApplicationjsonMembers`): ParametersPathGroupidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGroupidOrg]
  }
  
  extension [Self <: ParametersPathGroupidOrg](x: Self) {
    
    inline def setParameters(value: PathGroupidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMembers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
