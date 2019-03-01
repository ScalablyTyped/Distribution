package typings
package nodemailerLib.libXoauth2Mod.XOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An existing valid accessToken */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  /** Endpoint for token generation, defaults to 'https://accounts.google.com/o/oauth2/token' */
  var accessUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Client ID value */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** Client secret value */
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  /** Optional Access Token expire time in ms */
  var expires: js.UndefOr[nodemailerLib.libXoauth2Mod.ms] = js.undefined
  /** Private key for JSW */
  var privateKey: js.UndefOr[java.lang.String | nodemailerLib.Anon_Key] = js.undefined
  /** Function to run when a new access token is required */
  var provisionCallback: js.UndefOr[
    js.Function3[
      /* user */ java.lang.String, 
      /* renew */ scala.Boolean, 
      /* callback */ js.Function3[
        /* err */ nodeLib.Error | scala.Null, 
        /* accessToken */ java.lang.String, 
        /* expires */ scala.Double, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /** Refresh token for an user */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /** Optional TTL for Access Token in seconds */
  var timeout: js.UndefOr[nodemailerLib.libXoauth2Mod.s] = js.undefined
  /** User e-mail address */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    accessUrl: java.lang.String = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    expires: js.UndefOr[nodemailerLib.libXoauth2Mod.ms] = js.undefined,
    privateKey: java.lang.String | nodemailerLib.Anon_Key = null,
    provisionCallback: js.Function3[
      /* user */ java.lang.String, 
      /* renew */ scala.Boolean, 
      /* callback */ js.Function3[
        /* err */ nodeLib.Error | scala.Null, 
        /* accessToken */ java.lang.String, 
        /* expires */ scala.Double, 
        scala.Unit
      ], 
      scala.Unit
    ] = null,
    refreshToken: java.lang.String = null,
    timeout: js.UndefOr[nodemailerLib.libXoauth2Mod.s] = js.undefined,
    user: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (provisionCallback != null) __obj.updateDynamic("provisionCallback")(provisionCallback)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Options]
  }
}

