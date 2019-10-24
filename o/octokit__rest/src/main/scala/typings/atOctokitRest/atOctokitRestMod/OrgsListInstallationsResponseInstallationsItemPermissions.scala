package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(deployments = deployments, metadata = metadata, pull_requests = pull_requests, statuses = statuses)
  
    __obj.asInstanceOf[OrgsListInstallationsResponseInstallationsItemPermissions]
  }
}

