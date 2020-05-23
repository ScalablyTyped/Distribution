package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportEndpoint extends js.Object {
  var owner: String
  var repo: String
  /**
    * The password to provide to the originating repository.
    */
  var vcs_password: js.UndefOr[String] = js.undefined
  /**
    * The username to provide to the originating repository.
    */
  var vcs_username: js.UndefOr[String] = js.undefined
}

object MigrationsUpdateImportEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, vcs_password: String = null, vcs_username: String = null): MigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password.asInstanceOf[js.Any])
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportEndpoint]
  }
}

