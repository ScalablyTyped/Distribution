package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathHookidOwnerResponses6 extends StObject {
  
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  var post: ParametersPathHookidOwnerResponses6
}
object PostParametersPathHookidOwnerResponses6 {
  
  inline def apply(post: ParametersPathHookidOwnerResponses6): PostParametersPathHookidOwnerResponses6 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathHookidOwnerResponses6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathHookidOwnerResponses6] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathHookidOwnerResponses6): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
