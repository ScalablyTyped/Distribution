package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses202409 extends StObject {
  
  /** Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. */
  var post: Responses202409
}
object PostResponses202409 {
  
  inline def apply(post: Responses202409): PostResponses202409 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses202409]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses202409] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses202409): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
