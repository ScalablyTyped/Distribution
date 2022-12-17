package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonHeadsha extends StObject {
  
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * By default, check suites are automatically created when you create a [check run](https://docs.github.com/rest/reference/checks#check-runs). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Update repository preferences for check suites](https://docs.github.com/rest/reference/checks#update-repository-preferences-for-check-suites)". Your GitHub App must have the `checks:write` permission to create check suites.
    */
  var post: RequestBodyContentApplicationjsonHeadsha
}
object PostRequestBodyContentApplicationjsonHeadsha {
  
  inline def apply(post: RequestBodyContentApplicationjsonHeadsha): PostRequestBodyContentApplicationjsonHeadsha = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonHeadsha]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonHeadsha](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonHeadsha): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
