package typings
package nodemailerDashSmtpDashTransportLib.nodemailerDashSmtpDashTransportMod.smtpTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /** is the access token for the user. Required only if refreshToken is not available and there is no token refresh callback specified */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  /** is an optional HTTP endpoint for requesting new access tokens. This value defaults to Gmail */
  var accessUrl: js.UndefOr[java.lang.String] = js.undefined
  /** is the registered client id of the application */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** is the registered client secret of the application */
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  /** is an optional expiration time for the current accessToken */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /** is the password for the user if normal login is used */
  var pass: js.UndefOr[java.lang.String] = js.undefined
  /** is the private key contents, you can find it from the “private_key” field in the service key file */
  var privateKey: js.UndefOr[java.lang.String] = js.undefined
  /** is an optional refresh token. If it is provided then Nodemailer tries to generate a new access token if existing one expires or fails */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /** service client id, you can find it from the “client_id” field in the service key file */
  var serviceClient: js.UndefOr[java.lang.String] = js.undefined
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ */
  var `type`: js.UndefOr[js.Any] = js.undefined
  /** is the username */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    accessUrl: java.lang.String = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    expires: scala.Int | scala.Double = null,
    pass: java.lang.String = null,
    privateKey: java.lang.String = null,
    refreshToken: java.lang.String = null,
    serviceClient: java.lang.String = null,
    `type`: js.Any = null,
    user: java.lang.String = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (serviceClient != null) __obj.updateDynamic("serviceClient")(serviceClient)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AuthOptions]
  }
}

