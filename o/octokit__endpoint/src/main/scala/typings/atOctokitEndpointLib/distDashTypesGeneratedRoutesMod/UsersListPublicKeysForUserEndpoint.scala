package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListPublicKeysForUserEndpoint extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var username: java.lang.String
}

object UsersListPublicKeysForUserEndpoint {
  @scala.inline
  def apply(
    username: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): UsersListPublicKeysForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersListPublicKeysForUserEndpoint]
  }
}

