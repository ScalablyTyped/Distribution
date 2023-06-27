package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content462 extends StObject {
  
  /**
    * List public SSH keys for the authenticated user
    * @description Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: Responses200Content462
  
  /**
    * Create a public SSH key for the authenticated user
    * @description Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var post: RequestBodyContentApplicationjsonKeyTitle
}
object GetResponses200Content462 {
  
  inline def apply(get: Responses200Content462, post: RequestBodyContentApplicationjsonKeyTitle): GetResponses200Content462 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content462]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content462] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content462): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonKeyTitle): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
