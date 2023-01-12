package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201403404 extends StObject {
  
  /**
    * Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see ["Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var post: Responses201403404
}
object PostResponses201403404 {
  
  inline def apply(post: Responses201403404): PostResponses201403404 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses201403404] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses201403404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
