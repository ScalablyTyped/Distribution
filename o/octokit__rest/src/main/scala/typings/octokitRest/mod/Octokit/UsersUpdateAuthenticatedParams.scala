package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUpdateAuthenticatedParams extends js.Object {
  /**
    * The new short biography of the user.
    */
  var bio: js.UndefOr[String] = js.undefined
  /**
    * The new blog URL of the user.
    */
  var blog: js.UndefOr[String] = js.undefined
  /**
    * The new company of the user.
    */
  var company: js.UndefOr[String] = js.undefined
  /**
    * The publicly visible email address of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The new hiring availability of the user.
    */
  var hireable: js.UndefOr[Boolean] = js.undefined
  /**
    * The new location of the user.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The new name of the user.
    */
  var name: js.UndefOr[String] = js.undefined
}

object UsersUpdateAuthenticatedParams {
  @scala.inline
  def apply(
    bio: String = null,
    blog: String = null,
    company: String = null,
    email: String = null,
    hireable: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    name: String = null
  ): UsersUpdateAuthenticatedParams = {
    val __obj = js.Dynamic.literal()
    if (bio != null) __obj.updateDynamic("bio")(bio.asInstanceOf[js.Any])
    if (blog != null) __obj.updateDynamic("blog")(blog.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(hireable)) __obj.updateDynamic("hireable")(hireable.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersUpdateAuthenticatedParams]
  }
}

