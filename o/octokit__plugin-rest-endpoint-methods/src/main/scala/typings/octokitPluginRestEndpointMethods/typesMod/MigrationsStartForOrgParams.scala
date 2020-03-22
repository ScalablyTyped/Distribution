package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgParams extends js.Object {
  /**
    * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  var org: String
  /**
    * A list of arrays indicating which repositories should be migrated.
    */
  var repositories: js.Array[String]
}

object MigrationsStartForOrgParams {
  @scala.inline
  def apply(
    org: String,
    repositories: js.Array[String],
    exclude_attachments: js.UndefOr[Boolean] = js.undefined,
    lock_repositories: js.UndefOr[Boolean] = js.undefined
  ): MigrationsStartForOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments.asInstanceOf[js.Any])
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgParams]
  }
}

