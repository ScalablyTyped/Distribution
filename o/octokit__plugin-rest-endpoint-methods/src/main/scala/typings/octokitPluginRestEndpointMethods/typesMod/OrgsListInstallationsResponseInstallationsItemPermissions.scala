package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListInstallationsResponseInstallationsItemPermissions extends js.Object {
  var deployments: String
  var metadata: String
  var pull_requests: String
  var statuses: String
}

object OrgsListInstallationsResponseInstallationsItemPermissions {
  @scala.inline
  def apply(deployments: String, metadata: String, pull_requests: String, statuses: String): OrgsListInstallationsResponseInstallationsItemPermissions = {
    val __obj = js.Dynamic.literal(deployments = deployments.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListInstallationsResponseInstallationsItemPermissions]
  }
}

