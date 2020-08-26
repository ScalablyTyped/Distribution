package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesCreateEndpoint extends js.Object {
  /**
    * Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee for new issues. The assignee is silently dropped otherwise. **This field is deprecated.**_
    */
  var assignee: js.UndefOr[String] = js.native
  /**
    * Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._
    */
  var assignees: js.UndefOr[js.Array[String]] = js.native
  /**
    * The contents of the issue.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._
    */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The `number` of the milestone to associate this issue with. _NOTE: Only users with push access can set the milestone for new issues. The milestone is silently dropped otherwise._
    */
  var milestone: js.UndefOr[Double] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The title of the issue.
    */
  var title: String = js.native
}

object IssuesCreateEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, title: String): IssuesCreateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateEndpoint]
  }
  @scala.inline
  implicit class IssuesCreateEndpointOps[Self <: IssuesCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee(value: String): Self = this.set("assignee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignee: Self = this.set("assignee", js.undefined)
    @scala.inline
    def setAssigneesVarargs(value: String*): Self = this.set("assignees", js.Array(value :_*))
    @scala.inline
    def setAssignees(value: js.Array[String]): Self = this.set("assignees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignees: Self = this.set("assignees", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMilestone(value: Double): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestone: Self = this.set("milestone", js.undefined)
  }
  
}

