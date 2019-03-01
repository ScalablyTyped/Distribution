package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.login method.
  */
trait ILoginProperties extends js.Object {
  /**
    * This parameter only applies to web apps.
    * Contains the redirect URI to be used for OAuth authentication. This
    * value overrides the default redirect URI that is provided in the call
    * to WL.init.
    */
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
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
  var scope: js.Any
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
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ILoginProperties {
  @scala.inline
  def apply(scope: js.Any, redirect_uri: java.lang.String = null, state: java.lang.String = null): ILoginProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope")(scope)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ILoginProperties]
  }
}

