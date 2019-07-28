package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateLabelEndpoint extends js.Object {
  var color: String
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var owner: String
  var repo: String
}

object IssuesCreateLabelEndpoint {
  @scala.inline
  def apply(color: String, name: String, owner: String, repo: String, description: String = null): IssuesCreateLabelEndpoint = {
    val __obj = js.Dynamic.literal(color = color, name = name, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IssuesCreateLabelEndpoint]
  }
}

