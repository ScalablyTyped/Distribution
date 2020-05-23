package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCheckAssigneeEndpoint extends js.Object {
  var assignee: String
  var owner: String
  var repo: String
}

object IssuesCheckAssigneeEndpoint {
  @scala.inline
  def apply(assignee: String, owner: String, repo: String): IssuesCheckAssigneeEndpoint = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCheckAssigneeEndpoint]
  }
}

