package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesUpdateEndpoint extends StObject {
  
  /**
    * Login for the user that this issue should be assigned to. **This field is deprecated.**
    */
  var assignee: js.UndefOr[String] = js.undefined
  
  /**
    * Logins for Users to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this Issue. Send an empty array (`[]`) to clear all assignees from the Issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._
    */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The contents of the issue.
    */
  var body: js.UndefOr[String] = js.undefined
  
  var issue_number: Double
  
  /**
    * Labels to associate with this issue. Pass one or more Labels to _replace_ the set of Labels on this Issue. Send an empty array (`[]`) to clear all Labels from the Issue. _NOTE: Only users with push access can set labels for issues. Labels are silently dropped otherwise._
    */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The `number` of the milestone to associate this issue with or `null` to remove current. _NOTE: Only users with push access can set the milestone for issues. The milestone is silently dropped otherwise._
    */
  var milestone: js.UndefOr[Double | Null] = js.undefined
  
  var owner: String
  
  var repo: String
  
  /**
    * State of the issue. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  /**
    * The title of the issue.
    */
  var title: js.UndefOr[String] = js.undefined
}
object IssuesUpdateEndpoint {
  
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateEndpoint]
  }
  
  @scala.inline
  implicit class IssuesUpdateEndpointMutableBuilder[Self <: IssuesUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    @scala.inline
    def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    @scala.inline
    def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setMilestone(value: Double): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    @scala.inline
    def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
