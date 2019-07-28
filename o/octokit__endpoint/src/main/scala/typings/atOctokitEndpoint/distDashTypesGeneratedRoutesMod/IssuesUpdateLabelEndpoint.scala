package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateLabelEndpoint extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var current_name: String
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object IssuesUpdateLabelEndpoint {
  @scala.inline
  def apply(
    current_name: String,
    owner: String,
    repo: String,
    color: String = null,
    description: String = null,
    name: String = null
  ): IssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(current_name = current_name, owner = owner, repo = repo)
    if (color != null) __obj.updateDynamic("color")(color)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IssuesUpdateLabelEndpoint]
  }
}

