package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content625 extends StObject {
  
  /** Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: Responses200Content625
  
  /** Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var post: Responses201Content626
}
object GetResponses200Content625 {
  
  inline def apply(get: Responses200Content625, post: Responses201Content626): GetResponses200Content625 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content625]
  }
  
  extension [Self <: GetResponses200Content625](x: Self) {
    
    inline def setGet(value: Responses200Content625): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content626): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
