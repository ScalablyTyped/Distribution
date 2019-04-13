package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUpdateAuthenticatedParams extends js.Object {
  /**
    * The new short biography of the user.
    */
  var bio: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The new blog URL of the user.
    */
  var blog: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The new company of the user.
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publicly visible email address of the user.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The new hiring availability of the user.
    */
  var hireable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The new location of the user.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The new name of the user.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object UsersUpdateAuthenticatedParams {
  @scala.inline
  def apply(
    bio: java.lang.String = null,
    blog: java.lang.String = null,
    company: java.lang.String = null,
    email: java.lang.String = null,
    hireable: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    name: java.lang.String = null
  ): UsersUpdateAuthenticatedParams = {
    val __obj = js.Dynamic.literal()
    if (bio != null) __obj.updateDynamic("bio")(bio)
    if (blog != null) __obj.updateDynamic("blog")(blog)
    if (company != null) __obj.updateDynamic("company")(company)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(hireable)) __obj.updateDynamic("hireable")(hireable)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UsersUpdateAuthenticatedParams]
  }
}

