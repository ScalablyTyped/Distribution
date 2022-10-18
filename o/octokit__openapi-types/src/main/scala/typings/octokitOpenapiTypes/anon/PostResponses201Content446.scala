package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content446 extends StObject {
  
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.
    *
    * In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed 1000, GitHub will start to automatically delete older check runs.
    */
  var post: Responses201Content446
}
object PostResponses201Content446 {
  
  inline def apply(post: Responses201Content446): PostResponses201Content446 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content446]
  }
  
  extension [Self <: PostResponses201Content446](x: Self) {
    
    inline def setPost(value: Responses201Content446): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
