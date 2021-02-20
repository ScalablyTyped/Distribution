package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesRemoveAssigneesEndpoint extends StObject {
  
  /**
    * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an issue. Assignees are silently ignored otherwise._
    */
  var assignees: js.UndefOr[js.Array[String]] = js.native
  
  var issue_number: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object IssuesRemoveAssigneesEndpoint {
  
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesRemoveAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveAssigneesEndpoint]
  }
  
  @scala.inline
  implicit class IssuesRemoveAssigneesEndpointMutableBuilder[Self <: IssuesRemoveAssigneesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    @scala.inline
    def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value :_*))
    
    @scala.inline
    def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
