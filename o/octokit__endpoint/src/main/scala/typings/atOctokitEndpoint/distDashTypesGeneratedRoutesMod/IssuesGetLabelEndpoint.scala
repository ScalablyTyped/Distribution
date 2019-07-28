package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetLabelEndpoint extends js.Object {
  var name: String
  var owner: String
  var repo: String
}

object IssuesGetLabelEndpoint {
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesGetLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetLabelEndpoint]
  }
}

