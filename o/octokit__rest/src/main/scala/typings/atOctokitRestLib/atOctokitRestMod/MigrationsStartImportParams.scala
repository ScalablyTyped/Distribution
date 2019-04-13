package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartImportParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * For a tfvc import, the name of the project that is being imported.
    */
  var tfvc_project: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The originating VCS type. Can be one of `subversion`, `git`, `mercurial`, or `tfvc`. Please be aware that without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
    */
  var vcs: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.subversion | atOctokitRestLib.atOctokitRestLibStrings.git | atOctokitRestLib.atOctokitRestLibStrings.mercurial | atOctokitRestLib.atOctokitRestLibStrings.tfvc
  ] = js.undefined
  /**
    * If authentication is required, the password to provide to `vcs_url`.
    */
  var vcs_password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the originating repository.
    */
  var vcs_url: java.lang.String
  /**
    * If authentication is required, the username to provide to `vcs_url`.
    */
  var vcs_username: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationsStartImportParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    vcs_url: java.lang.String,
    tfvc_project: java.lang.String = null,
    vcs: atOctokitRestLib.atOctokitRestLibStrings.subversion | atOctokitRestLib.atOctokitRestLibStrings.git | atOctokitRestLib.atOctokitRestLibStrings.mercurial | atOctokitRestLib.atOctokitRestLibStrings.tfvc = null,
    vcs_password: java.lang.String = null,
    vcs_username: java.lang.String = null
  ): MigrationsStartImportParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, vcs_url = vcs_url)
    if (tfvc_project != null) __obj.updateDynamic("tfvc_project")(tfvc_project)
    if (vcs != null) __obj.updateDynamic("vcs")(vcs.asInstanceOf[js.Any])
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password)
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username)
    __obj.asInstanceOf[MigrationsStartImportParams]
  }
}

