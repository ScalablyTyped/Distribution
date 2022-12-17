package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent172 extends StObject {
  
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    *
    * In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed 1000, GitHub will start to automatically delete older check runs.
    */
  var post: RequestBodyContent172
}
object PostRequestBodyContent172 {
  
  inline def apply(post: RequestBodyContent172): PostRequestBodyContent172 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent172]
  }
  
  extension [Self <: PostRequestBodyContent172](x: Self) {
    
    inline def setPost(value: RequestBodyContent172): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
