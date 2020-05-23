package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgEndpoint extends js.Object {
  /**
    * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  @JSName("org")
  var org_ : String
  /**
    * A list of arrays indicating which repositories should be migrated.
    */
  var repositories: js.Array[String]
}

object MigrationsStartForOrgEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    repositories: js.Array[String],
    exclude_attachments: js.UndefOr[Boolean] = js.undefined,
    lock_repositories: js.UndefOr[Boolean] = js.undefined
  ): MigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgEndpoint]
  }
}

