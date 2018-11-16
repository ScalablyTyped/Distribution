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

