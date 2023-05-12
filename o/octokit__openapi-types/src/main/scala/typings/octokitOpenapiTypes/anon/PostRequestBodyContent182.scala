package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent182 extends StObject {
  
  /**
    * Create a check run
    * @description **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    *
    * In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed 1000, GitHub will start to automatically delete older check runs.
    */
  var post: RequestBodyContent182
}
object PostRequestBodyContent182 {
  
  inline def apply(post: RequestBodyContent182): PostRequestBodyContent182 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent182]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent182] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent182): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
