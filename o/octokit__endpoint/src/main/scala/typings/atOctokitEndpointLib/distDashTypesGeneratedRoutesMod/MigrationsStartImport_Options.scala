package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartImport_Options extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var tfvc_project: js.UndefOr[java.lang.String] = js.undefined
  var vcs: js.UndefOr[java.lang.String] = js.undefined
  var vcs_password: js.UndefOr[java.lang.String] = js.undefined
  var vcs_url: java.lang.String
  var vcs_username: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationsStartImport_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    vcs_url: java.lang.String,
    tfvc_project: java.lang.String = null,
    vcs: java.lang.String = null,
    vcs_password: java.lang.String = null,
    vcs_username: java.lang.String = null
  ): MigrationsStartImport_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, vcs_url = vcs_url)
    if (tfvc_project != null) __obj.updateDynamic("tfvc_project")(tfvc_project)
    if (vcs != null) __obj.updateDynamic("vcs")(vcs)
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password)
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username)
    __obj.asInstanceOf[MigrationsStartImport_Options]
  }
}

