package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathChecksuiteidOwnerRepoResponses201Content4 extends StObject {
  
  /**
    * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://docs.github.com/webhooks/event-payloads/#check_suite) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  var post: ParametersPathChecksuiteidOwnerRepoResponses201Content4
}
object PostParametersPathChecksuiteidOwnerRepoResponses201Content4 {
  
  inline def apply(post: ParametersPathChecksuiteidOwnerRepoResponses201Content4): PostParametersPathChecksuiteidOwnerRepoResponses201Content4 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathChecksuiteidOwnerRepoResponses201Content4]
  }
  
  extension [Self <: PostParametersPathChecksuiteidOwnerRepoResponses201Content4](x: Self) {
    
    inline def setPost(value: ParametersPathChecksuiteidOwnerRepoResponses201Content4): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
