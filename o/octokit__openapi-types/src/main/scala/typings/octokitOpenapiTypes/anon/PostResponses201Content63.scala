package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content63 extends StObject {
  
  /**
    * Re-run failed jobs from a workflow run
    * @description Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var post: Responses201Content63
}
object PostResponses201Content63 {
  
  inline def apply(post: Responses201Content63): PostResponses201Content63 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content63]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses201Content63] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses201Content63): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
