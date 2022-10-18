package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommentidOwnerRepoQuery374 extends StObject {
  
  /** List the reactions to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments). */
  var get: ParametersPathCommentidOwnerRepoQuery374
  
  /** Create a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#comments). A response with an HTTP `200` status means that you already added the reaction type to this pull request review comment. */
  var post: Responses201Content376
}
object GetParametersPathCommentidOwnerRepoQuery374 {
  
  inline def apply(get: ParametersPathCommentidOwnerRepoQuery374, post: Responses201Content376): GetParametersPathCommentidOwnerRepoQuery374 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommentidOwnerRepoQuery374]
  }
  
  extension [Self <: GetParametersPathCommentidOwnerRepoQuery374](x: Self) {
    
    inline def setGet(value: ParametersPathCommentidOwnerRepoQuery374): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content376): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
