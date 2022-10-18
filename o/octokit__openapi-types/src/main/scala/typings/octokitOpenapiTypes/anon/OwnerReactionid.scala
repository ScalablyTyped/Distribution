package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerReactionid extends StObject {
  
  /** The unique identifier of the comment. */
  var comment_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The unique identifier of the reaction. */
  var reaction_id: Double
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object OwnerReactionid {
  
  inline def apply(comment_id: Double, owner: String, reaction_id: Double, repo: String): OwnerReactionid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerReactionid]
  }
  
  extension [Self <: OwnerReactionid](x: Self) {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
