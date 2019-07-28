package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationReposForAuthenticatedUserEndpoint extends js.Object {
  var installation_id: Double
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object AppsListInstallationReposForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(installation_id: Double, page: Int | Double = null, per_page: Int | Double = null): AppsListInstallationReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationReposForAuthenticatedUserEndpoint]
  }
}

