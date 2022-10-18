package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgString extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonSecrets`
}
object ParametersPathOrgString {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonSecrets`): ParametersPathOrgString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgString]
  }
  
  extension [Self <: ParametersPathOrgString](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecrets`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
