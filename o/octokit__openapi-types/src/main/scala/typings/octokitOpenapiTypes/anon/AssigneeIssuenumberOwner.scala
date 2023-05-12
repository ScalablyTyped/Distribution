package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssigneeIssuenumberOwner extends StObject {
  
  var assignee: String
  
  var issue_number: Double
  
  var owner: String
  
  var repo: String
}
object AssigneeIssuenumberOwner {
  
  inline def apply(assignee: String, issue_number: Double, owner: String, repo: String): AssigneeIssuenumberOwner = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssigneeIssuenumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssigneeIssuenumberOwner] (val x: Self) extends AnyVal {
    
    inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
