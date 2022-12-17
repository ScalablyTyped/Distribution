package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOwnerReactionid extends StObject {
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
    *
    * Delete a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
    */
  var delete: ParametersPathOwnerReactionid
}
object DeleteParametersPathOwnerReactionid {
  
  inline def apply(delete: ParametersPathOwnerReactionid): DeleteParametersPathOwnerReactionid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOwnerReactionid]
  }
  
  extension [Self <: DeleteParametersPathOwnerReactionid](x: Self) {
    
    inline def setDelete(value: ParametersPathOwnerReactionid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
