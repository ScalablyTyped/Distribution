package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgParams extends js.Object {
  /**
    * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    */
  var exclude_attachments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    */
  var lock_repositories: js.UndefOr[scala.Boolean] = js.undefined
  var org: java.lang.String
  /**
    * A list of arrays indicating which repositories should be migrated.
    */
  var repositories: js.Array[java.lang.String]
}

object MigrationsStartForOrgParams {
  @scala.inline
  def apply(
    org: java.lang.String,
    repositories: js.Array[java.lang.String],
    exclude_attachments: js.UndefOr[scala.Boolean] = js.undefined,
    lock_repositories: js.UndefOr[scala.Boolean] = js.undefined
  ): MigrationsStartForOrgParams = {
    val __obj = js.Dynamic.literal(org = org, repositories = repositories)
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments)
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories)
    __obj.asInstanceOf[MigrationsStartForOrgParams]
  }
}

