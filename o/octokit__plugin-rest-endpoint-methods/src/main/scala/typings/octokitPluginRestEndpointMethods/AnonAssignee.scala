package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssignee extends js.Object {
  var assignee: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonAssignee {
  @scala.inline
  def apply(assignee: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonAssignee = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssignee]
  }
}

