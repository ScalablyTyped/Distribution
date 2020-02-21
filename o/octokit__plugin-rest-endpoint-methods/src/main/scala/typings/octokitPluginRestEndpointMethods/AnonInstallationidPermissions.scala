package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstallationidPermissions extends js.Object {
  var installation_id: AnonRequired
  var permissions: AnonType
  var repository_ids: AnonType
}

object AnonInstallationidPermissions {
  @scala.inline
  def apply(installation_id: AnonRequired, permissions: AnonType, repository_ids: AnonType): AnonInstallationidPermissions = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository_ids = repository_ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInstallationidPermissions]
  }
}

