package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent143 extends StObject {
  
  /** Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. */
  var post: RequestBodyContent143
}
object PostRequestBodyContent143 {
  
  inline def apply(post: RequestBodyContent143): PostRequestBodyContent143 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent143]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent143] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent143): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
