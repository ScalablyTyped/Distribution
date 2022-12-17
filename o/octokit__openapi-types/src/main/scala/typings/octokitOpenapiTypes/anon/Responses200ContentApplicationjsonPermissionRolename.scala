package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonPermissionRolename extends StObject {
  
  var parameters: PathOwnerRepoUsername
  
  var responses: `200ContentApplicationjsonPermissionRolename`
}
object Responses200ContentApplicationjsonPermissionRolename {
  
  inline def apply(parameters: PathOwnerRepoUsername, responses: `200ContentApplicationjsonPermissionRolename`): Responses200ContentApplicationjsonPermissionRolename = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonPermissionRolename]
  }
  
  extension [Self <: Responses200ContentApplicationjsonPermissionRolename](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonPermissionRolename`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
