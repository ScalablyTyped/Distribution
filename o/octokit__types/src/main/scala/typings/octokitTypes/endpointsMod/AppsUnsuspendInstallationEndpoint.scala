package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsUnsuspendInstallationEndpoint extends js.Object {
  var installation_id: Double
}

object AppsUnsuspendInstallationEndpoint {
  @scala.inline
  def apply(installation_id: Double): AppsUnsuspendInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsUnsuspendInstallationEndpoint]
  }
}

