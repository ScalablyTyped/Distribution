package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.git
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mercurial
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.subversion
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.tfvc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartImportParams extends js.Object {
  var owner: String
  var repo: String
  /**
    * For a tfvc import, the name of the project that is being imported.
    */
  var tfvc_project: js.UndefOr[String] = js.undefined
  /**
    * The originating VCS type. Can be one of `subversion`, `git`, `mercurial`, or `tfvc`. Please be aware that without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
    */
  var vcs: js.UndefOr[subversion | git | mercurial | tfvc] = js.undefined
  /**
    * If authentication is required, the password to provide to `vcs_url`.
    */
  var vcs_password: js.UndefOr[String] = js.undefined
  /**
    * The URL of the originating repository.
    */
  var vcs_url: String
  /**
    * If authentication is required, the username to provide to `vcs_url`.
    */
  var vcs_username: js.UndefOr[String] = js.undefined
}

object MigrationsStartImportParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    vcs_url: String,
    tfvc_project: String = null,
    vcs: subversion | git | mercurial | tfvc = null,
    vcs_password: String = null,
    vcs_username: String = null
  ): MigrationsStartImportParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    if (tfvc_project != null) __obj.updateDynamic("tfvc_project")(tfvc_project.asInstanceOf[js.Any])
    if (vcs != null) __obj.updateDynamic("vcs")(vcs.asInstanceOf[js.Any])
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password.asInstanceOf[js.Any])
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartImportParams]
  }
}

