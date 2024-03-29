package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathUsernameResponses extends StObject {
  
  /**
    * Remove public organization membership for the authenticated user
    * @description Removes the public membership for the authenticated user from the specified organization, unless public visibility is enforced by default.
    */
  var delete: ParametersPathUsernameResponses
  
  /**
    * Check public organization membership for a user
    * @description Check if the provided user is a public member of the organization.
    */
  var get: ParametersPathUsernameResponses
  
  /**
    * Set public organization membership for the authenticated user
    * @description The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: Responses102
}
object GetParametersPathUsernameResponses {
  
  inline def apply(delete: ParametersPathUsernameResponses, get: ParametersPathUsernameResponses, put: Responses102): GetParametersPathUsernameResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathUsernameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathUsernameResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathUsernameResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathUsernameResponses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses102): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
