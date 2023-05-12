package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses88 extends StObject {
  
  /**
    * Remove an organization member
    * @description Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  var delete: Responses88
  
  /**
    * Check organization membership for a user
    * @description Check if a user is, publicly or privately, a member of the organization.
    */
  var get: ParametersPathUsernameResponses
}
object DeleteResponses88 {
  
  inline def apply(delete: Responses88, get: ParametersPathUsernameResponses): DeleteResponses88 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses88]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses88] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses88): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathUsernameResponses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
