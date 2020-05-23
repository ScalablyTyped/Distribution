package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForAuthenticatedUserEndpoint extends js.Object {
  /**
    * Does not include attachments uploaded to GitHub.com in the migration data when set to `true`. Excluding attachments will reduce the migration archive file size.
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  /**
    * Locks the `repositories` to prevent changes during the migration when set to `true`.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of repositories to include in the migration.
    */
  var repositories: js.Array[String]
}

object MigrationsStartForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    repositories: js.Array[String],
    exclude_attachments: js.UndefOr[Boolean] = js.undefined,
    lock_repositories: js.UndefOr[Boolean] = js.undefined
  ): MigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserEndpoint]
  }
}

