package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeOAuth2
  extends nodemailerLib.libXoauth2Mod.Options
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.oauth2 | nodemailerLib.nodemailerLibStrings.OAuth2 | nodemailerLib.nodemailerLibStrings.OAUTH2
  ] = js.undefined
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    accessUrl: java.lang.String = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    expires: js.UndefOr[nodemailerLib.libXoauth2Mod.ms] = js.undefined,
    privateKey: java.lang.String | nodemailerLib.Anon_Key = null,
    provisionCallback: (/* user */ java.lang.String, /* renew */ scala.Boolean, /* callback */ js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* accessToken */ java.lang.String, 
      /* expires */ scala.Double, 
      scala.Unit
    ]) => scala.Unit = null,
    refreshToken: java.lang.String = null,
    serviceClient: java.lang.String = null,
    timeout: js.UndefOr[nodemailerLib.libXoauth2Mod.s] = js.undefined,
    `type`: nodemailerLib.nodemailerLibStrings.oauth2 | nodemailerLib.nodemailerLibStrings.OAuth2 | nodemailerLib.nodemailerLibStrings.OAUTH2 = null,
    user: java.lang.String = null
  ): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (provisionCallback != null) __obj.updateDynamic("provisionCallback")(js.Any.fromFunction3(provisionCallback))
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (serviceClient != null) __obj.updateDynamic("serviceClient")(serviceClient)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
}

