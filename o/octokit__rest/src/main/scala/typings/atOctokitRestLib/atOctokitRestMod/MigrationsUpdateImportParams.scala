package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * The password to provide to the originating repository.
    */
  var vcs_password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The username to provide to the originating repository.
    */
  var vcs_username: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationsUpdateImportParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    vcs_password: java.lang.String = null,
    vcs_username: java.lang.String = null
  ): MigrationsUpdateImportParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (vcs_password != null) __obj.updateDynamic("vcs_password")(vcs_password)
    if (vcs_username != null) __obj.updateDynamic("vcs_username")(vcs_username)
    __obj.asInstanceOf[MigrationsUpdateImportParams]
  }
}

