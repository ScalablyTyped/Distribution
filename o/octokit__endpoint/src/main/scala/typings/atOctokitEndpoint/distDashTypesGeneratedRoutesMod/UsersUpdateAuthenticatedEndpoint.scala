package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUpdateAuthenticatedEndpoint extends js.Object {
  var bio: js.UndefOr[String] = js.undefined
  var blog: js.UndefOr[String] = js.undefined
  var company: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var hireable: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object UsersUpdateAuthenticatedEndpoint {
  @scala.inline
  def apply(
    bio: String = null,
    blog: String = null,
    company: String = null,
    email: String = null,
    hireable: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    name: String = null
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

