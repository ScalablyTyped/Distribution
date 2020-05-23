package typings.npmRegistryFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.AuthOptions> */
trait PartialAuthOptions extends js.Object {
  var _auth: js.UndefOr[String] = js.undefined
  var _authToken: js.UndefOr[String] = js.undefined
  var _password: js.UndefOr[String] = js.undefined
  var `always-auth`: js.UndefOr[Boolean] = js.undefined
  var alwaysAuth: js.UndefOr[Boolean] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var otp: js.UndefOr[Double | String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object PartialAuthOptions {
  @scala.inline
  def apply(
    _auth: String = null,
    _authToken: String = null,
    _password: String = null,
    `always-auth`: js.UndefOr[Boolean] = js.undefined,
    alwaysAuth: js.UndefOr[Boolean] = js.undefined,
    email: String = null,
    otp: Double | String = null,
    password: String = null,
    token: String = null,
    username: String = null
  ): PartialAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (_auth != null) __obj.updateDynamic("_auth")(_auth.asInstanceOf[js.Any])
    if (_authToken != null) __obj.updateDynamic("_authToken")(_authToken.asInstanceOf[js.Any])
    if (_password != null) __obj.updateDynamic("_password")(_password.asInstanceOf[js.Any])
    if (!js.isUndefined(`always-auth`)) __obj.updateDynamic("always-auth")(`always-auth`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysAuth)) __obj.updateDynamic("alwaysAuth")(alwaysAuth.get.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (otp != null) __obj.updateDynamic("otp")(otp.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAuthOptions]
  }
}

