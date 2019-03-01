package typings
package pinterestDashSdkLib.pinterestDashSdkMod.PDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions extends js.Object {
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var cookie: js.UndefOr[scala.Boolean] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var scope: java.lang.String | OAuthScopes
  var session: js.UndefOr[OauthSession] = js.undefined
}

object LoginOptions {
  @scala.inline
  def apply(
    scope: java.lang.String | OAuthScopes,
    appId: java.lang.String = null,
    cookie: js.UndefOr[scala.Boolean] = js.undefined,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    session: OauthSession = null
  ): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (method != null) __obj.updateDynamic("method")(method)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[LoginOptions]
  }
}

