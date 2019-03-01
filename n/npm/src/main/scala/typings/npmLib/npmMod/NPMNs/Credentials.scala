package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var scope: java.lang.String
  var token: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    scope: java.lang.String,
    auth: java.lang.String = null,
    email: java.lang.String = null,
    password: java.lang.String = null,
    token: java.lang.String = null,
    username: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope")(scope)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (email != null) __obj.updateDynamic("email")(email)
    if (password != null) __obj.updateDynamic("password")(password)
    if (token != null) __obj.updateDynamic("token")(token)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Credentials]
  }
}

