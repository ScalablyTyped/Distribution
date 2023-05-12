package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content55403 extends StObject {
  
  /**
    * Re-run a job from a workflow run
    * @description Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var post: Responses201Content55403
}
object PostResponses201Content55403 {
  
  inline def apply(post: Responses201Content55403): PostResponses201Content55403 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content55403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses201Content55403] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses201Content55403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
