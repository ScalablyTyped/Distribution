package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateEndpoint extends js.Object {
  /**
    * Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee for new issues. The assignee is silently dropped otherwise. **This field is deprecated.**_
    */
  var assignee: js.UndefOr[String] = js.undefined
  /**
    * Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._
    */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The contents of the issue.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._
    */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The `number` of the milestone to associate this issue with. _NOTE: Only users with push access can set the milestone for new issues. The milestone is silently dropped otherwise._
    */
  var milestone: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
  /**
    * The title of the issue.
    */
  var title: String
}

object IssuesCreateEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    title: String,
    assignee: String = null,
    assignees: js.Array[String] = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: js.UndefOr[Double] = js.undefined
  ): IssuesCreateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (assignees != null) __obj.updateDynamic("assignees")(assignees.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(milestone)) __obj.updateDynamic("milestone")(milestone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateEndpoint]
  }
}

