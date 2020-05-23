package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.anon.Key
import typings.nodemailer.nodemailerStrings.CUSTOM
import typings.nodemailer.nodemailerStrings.Custom_
import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.nodemailerStrings.Login_
import typings.nodemailer.nodemailerStrings.OAUTH2
import typings.nodemailer.nodemailerStrings.OAuth2_
import typings.nodemailer.nodemailerStrings.custom__
import typings.nodemailer.nodemailerStrings.login__
import typings.nodemailer.nodemailerStrings.oauth2__
import typings.nodemailer.xoauth2Mod.s
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.smtpConnectionMod.AuthenticationTypeCustom
  - typings.nodemailer.smtpConnectionMod.AuthenticationTypeLogin
  - typings.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object

object AuthenticationType {
  @scala.inline
  def AuthenticationTypeCustom(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  @scala.inline
  def AuthenticationTypeLogin(pass: String, user: String, `type`: login__ | Login_ | LOGIN = null): AuthenticationType = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  @scala.inline
  def AuthenticationTypeOAuth2(
    accessToken: String = null,
    accessUrl: String = null,
    clientId: String = null,
    clientSecret: String = null,
    expires: js.UndefOr[typings.nodemailer.xoauth2Mod.ms] = js.undefined,
    privateKey: String | Key = null,
    provisionCallback: (/* user */ String, /* renew */ Boolean, /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit]) => Unit = null,
    refreshToken: String = null,
    serviceClient: String = null,
    timeout: js.UndefOr[s] = js.undefined,
    `type`: oauth2__ | OAuth2_ | OAUTH2 = null,
    user: String = null
  ): AuthenticationType = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (provisionCallback != null) __obj.updateDynamic("provisionCallback")(js.Any.fromFunction3(provisionCallback))
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (serviceClient != null) __obj.updateDynamic("serviceClient")(serviceClient.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
}

