package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

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
    val __obj = js.Dynamic.literal(assignee = assignee, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCheckAssigneeEndpoint]
  }
}

