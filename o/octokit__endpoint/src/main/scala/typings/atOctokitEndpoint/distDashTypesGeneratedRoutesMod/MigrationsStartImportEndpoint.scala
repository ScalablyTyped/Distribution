package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartImportEndpoint extends js.Object {
  var owner: String
  var repo: String
  var tfvc_project: js.UndefOr[String] = js.undefined
  var vcs: js.UndefOr[String] = js.undefined
  var vcs_password: js.UndefOr[String] = js.undefined
  var vcs_url: String
  var vcs_username: js.UndefOr[String] = js.undefined
}

object MigrationsStartImportEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    vcs_url: String,
    tfvc_project: String = null,
    vcs: String = null,
    vcs_password: String = null,
    vcs_username: String = null
  ): MigrationsStartImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, vcs_url = vcs_url)
    if (tfvc_project != null) __obj.updateDynamic("tfvc_project")(tfvc_project)
    if (vcs != null) __obj.updateDynamic("vcs")(vcs)
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password)
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username)
    __obj.asInstanceOf[MigrationsStartImportEndpoint]
  }
}

