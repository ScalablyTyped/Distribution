package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenEndpoint extends js.Object {
  var installation_id: Double
  var permissions: js.UndefOr[js.Object] = js.undefined
  var repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object AppsCreateInstallationTokenEndpoint {
  @scala.inline
  def apply(installation_id: Double, permissions: js.Object = null, repository_ids: js.Array[Double] = null): AppsCreateInstallationTokenEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (repository_ids != null) __obj.updateDynamic("repository_ids")(repository_ids)
    __obj.asInstanceOf[AppsCreateInstallationTokenEndpoint]
  }
}

