package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentidOwnerPullnumber extends StObject {
  
  /** The unique identifier of the comment. */
  var comment_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The number that identifies the pull request. */
  var pull_number: Double
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object CommentidOwnerPullnumber {
  
  inline def apply(comment_id: Double, owner: String, pull_number: Double, repo: String): CommentidOwnerPullnumber = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentidOwnerPullnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentidOwnerPullnumber] (val x: Self) extends AnyVal {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
