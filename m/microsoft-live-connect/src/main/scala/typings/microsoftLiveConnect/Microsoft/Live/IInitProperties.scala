package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.init method.
  */
@js.native
trait IInitProperties extends js.Object {
  /**
    * Web apps: Required.
    * Specifies your app's OAuth client ID for web apps.
    *
    * Windows Store apps using JavaScript: not needed.
    */
  var client_id: js.UndefOr[String] = js.native
  /**
    * If set to "true", the library logs error info to the web browser
    * console and notifies your app by means of the wl.log event.
    * @default true
    */
  var logging: js.UndefOr[Boolean] = js.native
  /**
    * Contains the default redirect URI to be used for OAuth
    * authentication. For web apps, the OAuth server redirects to this URI
    * during the OAuth flow.
    *
    * For Windows Store apps using JavaScript, specifying this value will
    * enable the library to return the authentication token.
    */
  var redirect_uri: js.UndefOr[String] = js.native
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
  var response_type: js.UndefOr[String] = js.native
  /**
    * The scope values used to determine which portions of user data the
    * app has access to, if the user consents.
    *
    * For a single scope, use this format: scope: "wl.signin". For multiple
    * scopes, use this format: scope: ["wl.signin", "wl.basic"].
    */
  var scope: js.UndefOr[js.Any] = js.native
  /**
    * Web apps: optional.
    * Windows Store apps using JavaScript: not applicable.
    * If set to "true", the library specifies a secure attribute when
    * writing a cookie on an HTTPS page.
    * @default "false"
    */
  var secure_cookie: js.UndefOr[String] = js.native
  /**
    * Web apps: optional.
    * Windows Store apps using JavaScript: not applicable.
    * If set to "true", the library attempts to retrieve the user's sign-in
    * status from Live Connect.
    * @default true
    */
  var status: js.UndefOr[Boolean] = js.native
}

object IInitProperties {
  @scala.inline
  def apply(): IInitProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitProperties]
  }
  @scala.inline
  implicit class IInitPropertiesOps[Self <: IInitProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSecure_cookie(value: String): Self = this.set("secure_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure_cookie: Self = this.set("secure_cookie", js.undefined)
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

