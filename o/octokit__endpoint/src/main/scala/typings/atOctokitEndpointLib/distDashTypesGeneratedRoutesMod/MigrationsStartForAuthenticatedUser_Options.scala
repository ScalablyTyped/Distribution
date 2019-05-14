package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForAuthenticatedUser_Options extends js.Object {
  var exclude_attachments: js.UndefOr[scala.Boolean] = js.undefined
  var lock_repositories: js.UndefOr[scala.Boolean] = js.undefined
  var repositories: js.Array[java.lang.String]
}

object MigrationsStartForAuthenticatedUser_Options {
  @scala.inline
  def apply(
    repositories: js.Array[java.lang.String],
    exclude_attachments: js.UndefOr[scala.Boolean] = js.undefined,
    lock_repositories: js.UndefOr[scala.Boolean] = js.undefined
  ): MigrationsStartForAuthenticatedUser_Options = {
    val __obj = js.Dynamic.literal(repositories = repositories)
    if (!js.isUndefined(exclude_attachments)) __obj.updateDynamic("exclude_attachments")(exclude_attachments)
    if (!js.isUndefined(lock_repositories)) __obj.updateDynamic("lock_repositories")(lock_repositories)
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUser_Options]
  }
}

