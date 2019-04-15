package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateParams extends js.Object {
  /**
    * Login for the user that this issue should be assigned to. **This field is deprecated.**
    */
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logins for Users to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this Issue. Send an empty array (`[]`) to clear all assignees from the Issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._
    */
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The contents of the issue.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  var issue_number: scala.Double
  /**
    * Labels to associate with this issue. Pass one or more Labels to _replace_ the set of Labels on this Issue. Send an empty array (`[]`) to clear all Labels from the Issue. _NOTE: Only users with push access can set labels for issues. Labels are silently dropped otherwise._
    */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The `number` of the milestone to associate this issue with or `null` to remove current. _NOTE: Only users with push access can set the milestone for issues. The milestone is silently dropped otherwise._
    */
  var milestone: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * State of the issue. Either `open` or `closed`.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed
  ] = js.undefined
  /**
    * The title of the issue.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesUpdateParams {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    assignee: java.lang.String = null,
    assignees: js.Array[java.lang.String] = null,
    body: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    milestone: scala.Int | scala.Double = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed = null,
    title: java.lang.String = null
  ): IssuesUpdateParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IssuesUpdateParams]
  }
}

