package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCheckAssigneeParams extends js.Object {
  var assignee: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesCheckAssigneeParams {
  @scala.inline
  def apply(assignee: java.lang.String, owner: java.lang.String, repo: java.lang.String): IssuesCheckAssigneeParams = {
    val __obj = js.Dynamic.literal(assignee = assignee, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCheckAssigneeParams]
  }
}

