package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateLabelEndpoint extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var current_name: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesUpdateLabelEndpoint {
  @scala.inline
  def apply(
    current_name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    color: java.lang.String = null,
    description: java.lang.String = null,
    name: java.lang.String = null
  ): IssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(current_name = current_name, owner = owner, repo = repo)
    if (color != null) __obj.updateDynamic("color")(color)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IssuesUpdateLabelEndpoint]
  }
}

