package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathChecksuiteidResponses201Content63 extends StObject {
  
  /**
    * Rerequest a check suite
    * @description Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://docs.github.com/webhooks/event-payloads/#check_suite) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  var post: ParametersPathChecksuiteidResponses201Content63
}
object PostParametersPathChecksuiteidResponses201Content63 {
  
  inline def apply(post: ParametersPathChecksuiteidResponses201Content63): PostParametersPathChecksuiteidResponses201Content63 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathChecksuiteidResponses201Content63]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathChecksuiteidResponses201Content63] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathChecksuiteidResponses201Content63): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
