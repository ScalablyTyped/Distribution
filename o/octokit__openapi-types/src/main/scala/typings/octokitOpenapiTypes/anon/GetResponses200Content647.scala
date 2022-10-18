package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content647 extends StObject {
  
  /** Lists the SSH signing keys for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var get: Responses200Content647
  
  /** Creates an SSH signing key for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `write:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var post: Responses201Content648
}
object GetResponses200Content647 {
  
  inline def apply(get: Responses200Content647, post: Responses201Content648): GetResponses200Content647 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content647]
  }
  
  extension [Self <: GetResponses200Content647](x: Self) {
    
    inline def setGet(value: Responses200Content647): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content648): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
