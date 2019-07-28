package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateEndpoint extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var organization_permission: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
  var project_id: Double
  var state: js.UndefOr[String] = js.undefined
}

object ProjectsUpdateEndpoint {
  @scala.inline
  def apply(
    project_id: Double,
    body: String = null,
    name: String = null,
    organization_permission: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    state: String = null
  ): ProjectsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (name != null) __obj.updateDynamic("name")(name)
    if (organization_permission != null) __obj.updateDynamic("organization_permission")(organization_permission)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ProjectsUpdateEndpoint]
  }
}

