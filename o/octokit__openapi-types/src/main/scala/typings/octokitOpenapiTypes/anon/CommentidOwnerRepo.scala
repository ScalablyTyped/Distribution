package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentidOwnerRepo extends StObject {
  
  var comment_id: Double
  
  var owner: String
  
  var repo: String
}
object CommentidOwnerRepo {
  
  inline def apply(comment_id: Double, owner: String, repo: String): CommentidOwnerRepo = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
