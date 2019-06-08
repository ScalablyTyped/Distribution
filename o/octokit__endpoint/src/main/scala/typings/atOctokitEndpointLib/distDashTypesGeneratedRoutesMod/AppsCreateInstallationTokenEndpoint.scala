package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenEndpoint extends js.Object {
  var installation_id: scala.Double
  var permissions: js.UndefOr[js.Object] = js.undefined
  var repository_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object AppsCreateInstallationTokenEndpoint {
  @scala.inline
  def apply(
    installation_id: scala.Double,
    permissions: js.Object = null,
    repository_ids: js.Array[scala.Double] = null
  ): AppsCreateInstallationTokenEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (repository_ids != null) __obj.updateDynamic("repository_ids")(repository_ids)
    __obj.asInstanceOf[AppsCreateInstallationTokenEndpoint]
  }
}

