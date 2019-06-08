package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenResponse extends js.Object {
  var expires_at: java.lang.String
  var permissions: AppsCreateInstallationTokenResponsePermissions
  var repositories: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem]
  var token: java.lang.String
}

object AppsCreateInstallationTokenResponse {
  @scala.inline
  def apply(
    expires_at: java.lang.String,
    permissions: AppsCreateInstallationTokenResponsePermissions,
    repositories: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem],
    token: java.lang.String
  ): AppsCreateInstallationTokenResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at, permissions = permissions, repositories = repositories, token = token)
  
    __obj.asInstanceOf[AppsCreateInstallationTokenResponse]
  }
}

