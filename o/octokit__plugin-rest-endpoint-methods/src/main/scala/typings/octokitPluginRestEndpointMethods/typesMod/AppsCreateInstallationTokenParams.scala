package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenParams extends js.Object {
  var installation_id: Double
  /**
    * The permissions granted to the access token. The permissions object includes the permission names and their access type. For a complete list of permissions and allowable values, see "[GitHub App permissions](https://developer.github.com/apps/building-github-apps/creating-github-apps-using-url-parameters/#github-app-permissions)."
    */
  var permissions: js.UndefOr[AppsCreateInstallationTokenParamsPermissions] = js.undefined
  /**
    * The `id`s of the repositories that the installation token can access. Providing repository `id`s restricts the access of an installation token to specific repositories. You can use the "[List repositories](https://developer.github.com/v3/apps/installations/#list-repositories)" endpoint to get the `id` of all repositories that an installation can access. For example, you can select specific repositories when creating an installation token to restrict the number of repositories that can be cloned using the token.
    */
  var repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object AppsCreateInstallationTokenParams {
  @scala.inline
  def apply(
    installation_id: Double,
    permissions: AppsCreateInstallationTokenParamsPermissions = null,
    repository_ids: js.Array[Double] = null
  ): AppsCreateInstallationTokenParams = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (repository_ids != null) __obj.updateDynamic("repository_ids")(repository_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationTokenParams]
  }
}

