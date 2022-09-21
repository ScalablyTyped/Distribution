package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content377 extends StObject {
  
  /** Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: Responses200Content377
  
  /** Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var post: RequestBodyContentApplicationjsonKeyTitle
}
object GetResponses200Content377 {
  
  inline def apply(get: Responses200Content377, post: RequestBodyContentApplicationjsonKeyTitle): GetResponses200Content377 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content377]
  }
  
  extension [Self <: GetResponses200Content377](x: Self) {
    
    inline def setGet(value: Responses200Content377): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonKeyTitle): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
