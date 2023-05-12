package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathUsernameResponses extends StObject {
  
  /** Unblock a user from an organization */
  var delete: ParametersPathUsernameResponses
  
  /** Check if a user is blocked by an organization */
  var get: ParametersPathUsername
  
  /** Block a user from an organization */
  var put: Responses9
}
object DeleteParametersPathUsernameResponses {
  
  inline def apply(delete: ParametersPathUsernameResponses, get: ParametersPathUsername, put: Responses9): DeleteParametersPathUsernameResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathUsernameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathUsernameResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathUsernameResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses9): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
