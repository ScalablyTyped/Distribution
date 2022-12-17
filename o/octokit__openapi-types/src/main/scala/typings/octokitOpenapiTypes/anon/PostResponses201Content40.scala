package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content40 extends StObject {
  
  /**
    * Triggers GitHub to rerequest an existing check run, without pushing new code to a repository. This endpoint will trigger the [`check_run` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) event with the action `rerequested`. When a check run is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.
    *
    * To rerequest a check run, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.
    */
  var post: Responses201Content40
}
object PostResponses201Content40 {
  
  inline def apply(post: Responses201Content40): PostResponses201Content40 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content40]
  }
  
  extension [Self <: PostResponses201Content40](x: Self) {
    
    inline def setPost(value: Responses201Content40): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
