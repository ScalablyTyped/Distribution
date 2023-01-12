package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters433Responses201ContentApplicationjsonExpiresatPermissions extends StObject {
  
  var parameters: `433`
  
  var responses: `201ContentApplicationjsonExpiresatPermissions`
}
object Parameters433Responses201ContentApplicationjsonExpiresatPermissions {
  
  inline def apply(parameters: `433`, responses: `201ContentApplicationjsonExpiresatPermissions`): Parameters433Responses201ContentApplicationjsonExpiresatPermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters433Responses201ContentApplicationjsonExpiresatPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters433Responses201ContentApplicationjsonExpiresatPermissions] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExpiresatPermissions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
