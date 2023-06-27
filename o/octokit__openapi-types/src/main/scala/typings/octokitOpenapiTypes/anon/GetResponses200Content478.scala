package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content478 extends StObject {
  
  /**
    * List SSH signing keys for the authenticated user
    * @description Lists the SSH signing keys for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  var get: Responses200Content478
  
  /**
    * Create a SSH signing key for the authenticated user
    * @description Creates an SSH signing key for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `write:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  var post: Responses201Content479
}
object GetResponses200Content478 {
  
  inline def apply(get: Responses200Content478, post: Responses201Content479): GetResponses200Content478 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content478]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content478] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content478): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content479): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
