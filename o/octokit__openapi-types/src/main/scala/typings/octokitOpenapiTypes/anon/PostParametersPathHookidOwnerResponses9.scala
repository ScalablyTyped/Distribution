package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathHookidOwnerResponses9 extends StObject {
  
  /**
    * Test the push repository webhook
    * @description This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  var post: ParametersPathHookidOwnerResponses9
}
object PostParametersPathHookidOwnerResponses9 {
  
  inline def apply(post: ParametersPathHookidOwnerResponses9): PostParametersPathHookidOwnerResponses9 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathHookidOwnerResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathHookidOwnerResponses9] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathHookidOwnerResponses9): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
