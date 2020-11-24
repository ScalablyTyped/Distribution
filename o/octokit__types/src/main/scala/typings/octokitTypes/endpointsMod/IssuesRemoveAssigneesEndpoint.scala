package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesRemoveAssigneesEndpoint extends js.Object {
  
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
  implicit class IssuesRemoveAssigneesEndpointOps[Self <: IssuesRemoveAssigneesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIssue_number(value: Double): Self = this.set("issue_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneesVarargs(value: String*): Self = this.set("assignees", js.Array(value :_*))
    
    @scala.inline
    def setAssignees(value: js.Array[String]): Self = this.set("assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignees: Self = this.set("assignees", js.undefined)
  }
}
