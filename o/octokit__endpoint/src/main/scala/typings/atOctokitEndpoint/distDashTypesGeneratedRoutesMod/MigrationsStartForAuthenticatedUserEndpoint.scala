package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForAuthenticatedUserEndpoint extends js.Object {
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  var repositories: js.Array[String]
}

object MigrationsStartForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    repositories: js.Array[String],
    exclude_attachments: js.UndefOr[Boolean] = js.undefined,
    lock_repositories: js.UndefOr[Boolean] = js.undefined
  ): MigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories)
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments)
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories)
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserEndpoint]
  }
}

