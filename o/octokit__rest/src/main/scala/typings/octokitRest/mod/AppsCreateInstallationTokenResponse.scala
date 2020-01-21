package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenResponse extends js.Object {
  var expires_at: String
  var permissions: AppsCreateInstallationTokenResponsePermissions
  var repositories: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem]
  var token: String
}

object AppsCreateInstallationTokenResponse {
  @scala.inline
  def apply(
    expires_at: String,
    permissions: AppsCreateInstallationTokenResponsePermissions,
    repositories: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem],
    token: String
  ): AppsCreateInstallationTokenResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsCreateInstallationTokenResponse]
  }
}

