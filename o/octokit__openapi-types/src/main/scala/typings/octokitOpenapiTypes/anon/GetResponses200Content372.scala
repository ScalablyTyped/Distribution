package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content372 extends StObject {
  
  /** Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: Responses200Content372
  
  /** Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var post: RequestBodyContentApplicationjsonArmoredpublickey
}
object GetResponses200Content372 {
  
  inline def apply(get: Responses200Content372, post: RequestBodyContentApplicationjsonArmoredpublickey): GetResponses200Content372 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content372]
  }
  
  extension [Self <: GetResponses200Content372](x: Self) {
    
    inline def setGet(value: Responses200Content372): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonArmoredpublickey): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
