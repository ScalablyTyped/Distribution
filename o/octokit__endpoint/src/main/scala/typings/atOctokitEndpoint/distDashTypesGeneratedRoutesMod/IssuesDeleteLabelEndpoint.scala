package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteLabelEndpoint extends js.Object {
  var name: String
  var owner: String
  var repo: String
}

object IssuesDeleteLabelEndpoint {
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteLabelEndpoint]
  }
}

