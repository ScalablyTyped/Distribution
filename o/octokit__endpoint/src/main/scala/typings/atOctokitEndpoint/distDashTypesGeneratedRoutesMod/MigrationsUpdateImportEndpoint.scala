package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportEndpoint extends js.Object {
  var owner: String
  var repo: String
  var vcs_password: js.UndefOr[String] = js.undefined
  var vcs_username: js.UndefOr[String] = js.undefined
}

object MigrationsUpdateImportEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, vcs_password: String = null, vcs_username: String = null): MigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password)
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username)
    __obj.asInstanceOf[MigrationsUpdateImportEndpoint]
  }
}

