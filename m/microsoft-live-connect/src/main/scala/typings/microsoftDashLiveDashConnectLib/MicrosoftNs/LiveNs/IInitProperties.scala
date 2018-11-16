package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * 'Properties' object passed into the WL.init method.
     */

trait IInitProperties extends js.Object {
  /**
           * Web apps: Required.
           * Specifies your app's OAuth client ID for web apps.
           *
           * Windows Store apps using JavaScript: not needed.
           */
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set to "true", the library logs error info to the web browser
           * console and notifies your app by means of the wl.log event.
           * @default true
           */
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Contains the default redirect URI to be used for OAuth
           * authentication. For web apps, the OAuth server redirects to this URI
           * during the OAuth flow.
           *
           * For Windows Store apps using JavaScript, specifying this value will
           * enable the library to return the authentication token.
           */
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Web apps: optional.
           * Windows Store apps using JavaScript: not applicable.
           * Specifies the OAuth response type value. If set to "token", the
           * client receives the access token directly. If set to "code", the
           * client receives an authorization code, and the app server that serves
           * the redirect_uri page should retrieve the access_token from the OAuth
           * server by using the authorization code and client secret.
           *
           * You can only set response_type to "code" for web apps.
           * @default "token"
           */
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The scope values used to determine which portions of user data the
           * app has access to, if the user consents.
           *
           * For a single scope, use this format: scope: "wl.signin". For multiple
           * scopes, use this format: scope: ["wl.signin", "wl.basic"].
           */
  var scope: js.UndefOr[js.Any] = js.undefined
  /**
           * Web apps: optional.
           * Windows Store apps using JavaScript: not applicable.
           * If set to "true", the library specifies a secure attribute when
           * writing a cookie on an HTTPS page.
           * @default "false"
           */
  var secure_cookie: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Web apps: optional.
           * Windows Store apps using JavaScript: not applicable.
           * If set to "true", the library attempts to retrieve the user's sign-in
           * status from Live Connect.
           * @default true
           */
  var status: js.UndefOr[scala.Boolean] = js.undefined
}

