package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content458 extends StObject {
  
  /**
    * List GPG keys for the authenticated user
    * @description Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: Responses200Content458
  
  /**
    * Create a GPG key for the authenticated user
    * @description Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var post: RequestBodyContentApplicationjsonArmoredpublickey
}
object GetResponses200Content458 {
  
  inline def apply(get: Responses200Content458, post: RequestBodyContentApplicationjsonArmoredpublickey): GetResponses200Content458 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content458]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content458] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content458): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonArmoredpublickey): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
