package typings.npmRegistryFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /**
    * @deprecated
    * This is a legacy authentication token supported only for
    * compatibility. Please use `opts.token` instead.
    */
  var _auth: js.UndefOr[String] = js.undefined
  /**
    * Alias for `token`.
    */
  var _authToken: js.UndefOr[String] = js.undefined
  /**
    * Alias for `password`
    */
  var _password: js.UndefOr[String] = js.undefined
  var `always-auth`: js.UndefOr[Boolean] = js.undefined
  var alwaysAuth: js.UndefOr[Boolean] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  /**
    * This is a one-time password from a two-factor authenticator. It is
    * required for certain registry interactions when two-factor auth is
    * enabled for a user account.
    */
  var otp: js.UndefOr[Double | String] = js.undefined
  /**
    * Password used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:password': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.username`
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Authentication token string.
    *
    * Can be scoped to a registry by using a "nerf dart" for that registry.
    * That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:token': 't0k3nH34r'
    * }
    * ```
    */
  var token: js.UndefOr[String] = js.undefined
  /**
    * Username used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:username': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.password`
    */
  var username: js.UndefOr[String] = js.undefined
}

object AuthOptions {
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
  ): AuthOptions = {
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
    __obj.asInstanceOf[AuthOptions]
  }
}

