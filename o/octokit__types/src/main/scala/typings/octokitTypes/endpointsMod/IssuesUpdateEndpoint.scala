package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateEndpoint extends js.Object {
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
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    assignee: String = null,
    assignees: js.Array[String] = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: js.UndefOr[Null | Double] = js.undefined,
    state: open | closed = null,
    title: String = null
  ): IssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (assignees != null) __obj.updateDynamic("assignees")(assignees.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(milestone)) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateEndpoint]
  }
}

