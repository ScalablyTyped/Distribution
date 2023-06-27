package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommentidOwnerQuery extends StObject {
  
  /**
    * List reactions for a pull request review comment
    * @description List the reactions to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
    */
  var get: ParametersPathCommentidOwnerQuery
  
  /**
    * Create reaction for a pull request review comment
    * @description Create a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#comments). A response with an HTTP `200` status means that you already added the reaction type to this pull request review comment.
    */
  var post: Responses200201422
}
object GetParametersPathCommentidOwnerQuery {
  
  inline def apply(get: ParametersPathCommentidOwnerQuery, post: Responses200201422): GetParametersPathCommentidOwnerQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommentidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathCommentidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathCommentidOwnerQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200201422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
