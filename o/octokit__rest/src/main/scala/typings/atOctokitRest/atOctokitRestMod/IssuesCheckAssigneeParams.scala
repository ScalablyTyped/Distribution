package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCheckAssigneeParams extends js.Object {
  var assignee: String
  var owner: String
  var repo: String
}

object IssuesCheckAssigneeParams {
  @scala.inline
  def apply(assignee: String, owner: String, repo: String): IssuesCheckAssigneeParams = {
    val __obj = js.Dynamic.literal(assignee = assignee, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCheckAssigneeParams]
  }
}

