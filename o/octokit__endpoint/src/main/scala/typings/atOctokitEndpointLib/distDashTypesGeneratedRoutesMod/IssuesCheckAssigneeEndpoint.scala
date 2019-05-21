package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCheckAssigneeEndpoint extends js.Object {
  var assignee: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesCheckAssigneeEndpoint {
  @scala.inline
  def apply(assignee: java.lang.String, owner: java.lang.String, repo: java.lang.String): IssuesCheckAssigneeEndpoint = {
    val __obj = js.Dynamic.literal(assignee = assignee, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesCheckAssigneeEndpoint]
  }
}

