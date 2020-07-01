package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCheckUserCanBeAssignedEndpoint extends js.Object {
  var assignee: String
  var owner: String
  var repo: String
}

object IssuesCheckUserCanBeAssignedEndpoint {
  @scala.inline
  def apply(assignee: String, owner: String, repo: String): IssuesCheckUserCanBeAssignedEndpoint = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCheckUserCanBeAssignedEndpoint]
  }
}

