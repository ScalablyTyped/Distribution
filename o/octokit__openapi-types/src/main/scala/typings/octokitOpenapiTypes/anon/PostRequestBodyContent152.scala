package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent152 extends StObject {
  
  /** Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. */
  var post: RequestBodyContent152
}
object PostRequestBodyContent152 {
  
  inline def apply(post: RequestBodyContent152): PostRequestBodyContent152 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent152]
  }
  
  extension [Self <: PostRequestBodyContent152](x: Self) {
    
    inline def setPost(value: RequestBodyContent152): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
