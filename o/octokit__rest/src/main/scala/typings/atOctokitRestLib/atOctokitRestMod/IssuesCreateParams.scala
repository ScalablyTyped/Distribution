package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateParams extends js.Object {
  /**
    * Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee for new issues. The assignee is silently dropped otherwise. **This field is deprecated.**_
    */
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._
    */
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The contents of the issue.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._
    */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The `number` of the milestone to associate this issue with. _NOTE: Only users with push access can set the milestone for new issues. The milestone is silently dropped otherwise._
    */
  var milestone: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * The title of the issue.
    */
  var title: java.lang.String
}

object IssuesCreateParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    title: java.lang.String,
    assignee: java.lang.String = null,
    assignees: js.Array[java.lang.String] = null,
    body: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    milestone: scala.Int | scala.Double = null
  ): IssuesCreateParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, title = title)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateParams]
  }
}

