package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathHookidResponses7 extends StObject {
  
  /**
    * Ping an organization webhook
    * @description This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  var post: ParametersPathHookidResponses7
}
object PostParametersPathHookidResponses7 {
  
  inline def apply(post: ParametersPathHookidResponses7): PostParametersPathHookidResponses7 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathHookidResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathHookidResponses7] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathHookidResponses7): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
