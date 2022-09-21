package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonExpiresatPermissions extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `201ContentApplicationjsonExpiresatPermissions`
}
object Responses201ContentApplicationjsonExpiresatPermissions {
  
  inline def apply(parameters: PathEnterpriseString, responses: `201ContentApplicationjsonExpiresatPermissions`): Responses201ContentApplicationjsonExpiresatPermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonExpiresatPermissions]
  }
  
  extension [Self <: Responses201ContentApplicationjsonExpiresatPermissions](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExpiresatPermissions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
