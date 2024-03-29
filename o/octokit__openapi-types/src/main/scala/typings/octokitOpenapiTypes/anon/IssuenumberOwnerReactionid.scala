package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuenumberOwnerReactionid extends StObject {
  
  var issue_number: Double
  
  var owner: String
  
  var reaction_id: Double
  
  var repo: String
}
object IssuenumberOwnerReactionid {
  
  inline def apply(issue_number: Double, owner: String, reaction_id: Double, repo: String): IssuenumberOwnerReactionid = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuenumberOwnerReactionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuenumberOwnerReactionid] (val x: Self) extends AnyVal {
    
    inline def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
