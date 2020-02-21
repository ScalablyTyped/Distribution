package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssignees extends js.Object {
  var assignees: AnonType
  var issue_number: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonAssignees {
  @scala.inline
  def apply(
    assignees: AnonType,
    issue_number: AnonRequired,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonAssignees = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssignees]
  }
}

