package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathHookidOwnerRepoResponses236 extends StObject {
  
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  var post: ParametersPathHookidOwnerRepoResponses236
}
object PostParametersPathHookidOwnerRepoResponses236 {
  
  inline def apply(post: ParametersPathHookidOwnerRepoResponses236): PostParametersPathHookidOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathHookidOwnerRepoResponses236]
  }
  
  extension [Self <: PostParametersPathHookidOwnerRepoResponses236](x: Self) {
    
    inline def setPost(value: ParametersPathHookidOwnerRepoResponses236): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
