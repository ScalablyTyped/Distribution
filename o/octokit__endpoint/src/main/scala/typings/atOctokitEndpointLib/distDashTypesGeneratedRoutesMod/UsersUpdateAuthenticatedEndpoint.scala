package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUpdateAuthenticatedEndpoint extends js.Object {
  var bio: js.UndefOr[java.lang.String] = js.undefined
  var blog: js.UndefOr[java.lang.String] = js.undefined
  var company: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var hireable: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object UsersUpdateAuthenticatedEndpoint {
  @scala.inline
  def apply(
    bio: java.lang.String = null,
    blog: java.lang.String = null,
    company: java.lang.String = null,
    email: java.lang.String = null,
    hireable: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    name: java.lang.String = null
  ): UsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    if (bio != null) __obj.updateDynamic("bio")(bio)
    if (blog != null) __obj.updateDynamic("blog")(blog)
    if (company != null) __obj.updateDynamic("company")(company)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(hireable)) __obj.updateDynamic("hireable")(hireable)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UsersUpdateAuthenticatedEndpoint]
  }
}

