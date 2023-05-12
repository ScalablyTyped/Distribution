package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssigneeOwner extends StObject {
  
  var assignee: String
  
  var owner: String
  
  var repo: String
}
object AssigneeOwner {
  
  inline def apply(assignee: String, owner: String, repo: String): AssigneeOwner = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssigneeOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssigneeOwner] (val x: Self) extends AnyVal {
    
    inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
