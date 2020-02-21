package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssigneeAssignees extends js.Object {
  var assignee: AnonType
  var assignees: AnonType
  var body: AnonType
  var labels: AnonType
  var milestone: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var title: AnonRequired
}

object AnonAssigneeAssignees {
  @scala.inline
  def apply(
    assignee: AnonType,
    assignees: AnonType,
    body: AnonType,
    labels: AnonType,
    milestone: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    title: AnonRequired
  ): AnonAssigneeAssignees = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssigneeAssignees]
  }
}

