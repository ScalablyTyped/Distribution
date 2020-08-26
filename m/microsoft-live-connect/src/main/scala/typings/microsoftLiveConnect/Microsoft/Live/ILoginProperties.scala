package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.login method.
  */
@js.native
trait ILoginProperties extends js.Object {
  /**
    * This parameter only applies to web apps.
    * Contains the redirect URI to be used for OAuth authentication. This
    * value overrides the default redirect URI that is provided in the call
    * to WL.init.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  /**
    * Specifies the scopes to which the user who is signing in consents.
    *
    * For a single scope, use this format: scope: "wl.signin". For multiple
    * scopes, use this format: scope: ["wl.signin", "wl.basic"].
    *
    * If no scope is provided, the scope value of WL.init is used. If no
    * scope is provided in WL.init or WL.login, WL.login returns an error.
    *
    * Note  WL.login can request the "wl.offline_access" scope, but it
    * requires a server-side implementation, and the WL.init function must
    * set its response_type property to "code". For more info, see
    * Server-side scenarios.
    * http://msdn.microsoft.com/en-us/library/live/hh243649.aspx
    */
  var scope: js.Any = js.native
  /**
    * Windows Store apps using JavaScript: not applicable.
    * Web apps: Optional. If the WL.init function's response_type object is
    * set to "code" and the app uses server-flow authentication, the state
    * object here can be used to track the web app's calling state on the
    * web app server side. For more info, see the description of the state
    * query parameter in the Server-side scenarios topic's "Getting an
    * authorization code" section.
    * http://msdn.microsoft.com/en-us/library/live/hh243649.aspx
    */
  var state: js.UndefOr[String] = js.native
}

object ILoginProperties {
  @scala.inline
  def apply(scope: js.Any): ILoginProperties = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginProperties]
  }
  @scala.inline
  implicit class ILoginPropertiesOps[Self <: ILoginProperties] (val x: Self) extends AnyVal {
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
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

