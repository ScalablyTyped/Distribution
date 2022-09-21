package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathHookidResponses6 extends StObject {
  
  /** This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook. */
  var post: ParametersPathHookidResponses6
}
object PostParametersPathHookidResponses6 {
  
  inline def apply(post: ParametersPathHookidResponses6): PostParametersPathHookidResponses6 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathHookidResponses6]
  }
  
  extension [Self <: PostParametersPathHookidResponses6](x: Self) {
    
    inline def setPost(value: ParametersPathHookidResponses6): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
