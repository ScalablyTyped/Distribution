package typings.npm.mod.NPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var scope: String
  var token: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    scope: String,
    auth: String = null,
    email: String = null,
    password: String = null,
    token: String = null,
    username: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

