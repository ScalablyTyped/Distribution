package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateEndpoint extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var organization_permission: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var project_id: scala.Double
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectsUpdateEndpoint {
  @scala.inline
  def apply(
    project_id: scala.Double,
    body: java.lang.String = null,
    name: java.lang.String = null,
    organization_permission: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null
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

