package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonExpiresatPermissions extends StObject {
  
  var parameters: `582`
  
  var responses: `201ContentApplicationjsonExpiresatPermissions`
}
object Responses201ContentApplicationjsonExpiresatPermissions {
  
  inline def apply(parameters: `582`, responses: `201ContentApplicationjsonExpiresatPermissions`): Responses201ContentApplicationjsonExpiresatPermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonExpiresatPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonExpiresatPermissions] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExpiresatPermissions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
