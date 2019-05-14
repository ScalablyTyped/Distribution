package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListFollowingForAuthenticatedUser_Options extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object UsersListFollowingForAuthenticatedUser_Options {
  @scala.inline
  def apply(page: scala.Int | scala.Double = null, per_page: scala.Int | scala.Double = null): UsersListFollowingForAuthenticatedUser_Options = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersListFollowingForAuthenticatedUser_Options]
  }
}

