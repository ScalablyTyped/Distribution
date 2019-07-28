package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgEndpoint extends js.Object {
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  var org: String
  var repositories: js.Array[String]
}

object MigrationsStartForOrgEndpoint {
  @scala.inline
  def apply(
    org: String,
    repositories: js.Array[String],
    exclude_attachments: js.UndefOr[Boolean] = js.undefined,
    lock_repositories: js.UndefOr[Boolean] = js.undefined
  ): MigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(org = org, repositories = repositories)
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments)
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories)
    __obj.asInstanceOf[MigrationsStartForOrgEndpoint]
  }
}

