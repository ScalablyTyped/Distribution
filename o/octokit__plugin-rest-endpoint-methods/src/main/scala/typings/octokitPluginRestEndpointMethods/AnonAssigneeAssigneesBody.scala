package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssigneeAssigneesBody extends js.Object {
  var assignee: AnonType
  var assignees: AnonType
  var body: AnonType
  var issue_number: AnonRequired
  var labels: AnonType
  var milestone: AnonAllowNull
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
  var state: AnonEnum
  var title: AnonType
}

object AnonAssigneeAssigneesBody {
  @scala.inline
  def apply(
    assignee: AnonType,
    assignees: AnonType,
    body: AnonType,
    issue_number: AnonRequired,
    labels: AnonType,
    milestone: AnonAllowNull,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnum,
    title: AnonType
  ): AnonAssigneeAssigneesBody = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssigneeAssigneesBody]
  }
}

