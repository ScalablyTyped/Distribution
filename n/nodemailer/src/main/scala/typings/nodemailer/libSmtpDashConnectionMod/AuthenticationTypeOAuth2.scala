package typings.nodemailer.libSmtpDashConnectionMod

import typings.nodemailer.Anon_Key
import typings.nodemailer.nodemailerStrings.OAUTH2
import typings.nodemailer.nodemailerStrings.oauth2
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeOAuth2
  extends typings.nodemailer.libXoauth2Mod.Options
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[oauth2 | typings.nodemailer.nodemailerStrings.OAuth2 | OAUTH2] = js.undefined
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(
    accessToken: String = null,
    accessUrl: String = null,
    clientId: String = null,
    clientSecret: String = null,
    expires: Int | Double = null,
    privateKey: String | Anon_Key = null,
    provisionCallback: (/* user */ String, /* renew */ Boolean, /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit]) => Unit = null,
    refreshToken: String = null,
    serviceClient: String = null,
    timeout: Int | Double = null,
    `type`: oauth2 | typings.nodemailer.nodemailerStrings.OAuth2 | OAUTH2 = null,
    user: String = null
  ): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (provisionCallback != null) __obj.updateDynamic("provisionCallback")(js.Any.fromFunction3(provisionCallback))
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (serviceClient != null) __obj.updateDynamic("serviceClient")(serviceClient)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
}

