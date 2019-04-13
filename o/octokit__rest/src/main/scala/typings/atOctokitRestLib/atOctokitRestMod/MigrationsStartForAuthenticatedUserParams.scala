package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForAuthenticatedUserParams extends js.Object {
  /**
    * Does not include attachments uploaded to GitHub.com in the migration data when set to `true`. Excluding attachments will reduce the migration archive file size.
    */
  var exclude_attachments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Locks the `repositories` to prevent changes during the migration when set to `true`.
    */
  var lock_repositories: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of repositories to include in the migration.
    */
  var repositories: js.Array[java.lang.String]
}

object MigrationsStartForAuthenticatedUserParams {
  @scala.inline
  def apply(
    repositories: js.Array[java.lang.String],
    exclude_attachments: js.UndefOr[scala.Boolean] = js.undefined,
    lock_repositories: js.UndefOr[scala.Boolean] = js.undefined
  ): MigrationsStartForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(repositories = repositories)
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments)
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories)
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserParams]
  }
}

