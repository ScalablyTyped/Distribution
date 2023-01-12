package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePatch extends StObject {
  
  /** OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. */
  var delete: RequestBodyResponses
  
  /** OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`. */
  var patch: ParametersPathClientid
  
  /** OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) to use this endpoint, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`. */
  var post: ParametersRequestBodyResponses
}
object DeletePatch {
  
  inline def apply(delete: RequestBodyResponses, patch: ParametersPathClientid, post: ParametersRequestBodyResponses): DeletePatch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePatch] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPathClientid): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersRequestBodyResponses): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
