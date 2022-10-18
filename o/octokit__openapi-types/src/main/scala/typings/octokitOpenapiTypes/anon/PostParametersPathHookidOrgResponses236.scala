package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathHookidOrgResponses236 extends StObject {
  
  /** This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook. */
  var post: ParametersPathHookidOrgResponses236
}
object PostParametersPathHookidOrgResponses236 {
  
  inline def apply(post: ParametersPathHookidOrgResponses236): PostParametersPathHookidOrgResponses236 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathHookidOrgResponses236]
  }
  
  extension [Self <: PostParametersPathHookidOrgResponses236](x: Self) {
    
    inline def setPost(value: ParametersPathHookidOrgResponses236): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
