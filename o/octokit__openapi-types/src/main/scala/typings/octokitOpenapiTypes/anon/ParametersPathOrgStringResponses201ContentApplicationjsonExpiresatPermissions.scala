package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses201ContentApplicationjsonExpiresatPermissions extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `201ContentApplicationjsonExpiresatPermissions`
}
object ParametersPathOrgStringResponses201ContentApplicationjsonExpiresatPermissions {
  
  inline def apply(parameters: PathOrgString, responses: `201ContentApplicationjsonExpiresatPermissions`): ParametersPathOrgStringResponses201ContentApplicationjsonExpiresatPermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses201ContentApplicationjsonExpiresatPermissions]
  }
  
  extension [Self <: ParametersPathOrgStringResponses201ContentApplicationjsonExpiresatPermissions](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExpiresatPermissions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
