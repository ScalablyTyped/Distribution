package typings.pinterestDashSdk.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  /** Your application ID from developer.pinterest.com */
  var appId: js.UndefOr[String] = js.undefined
  var cookie: js.UndefOr[Boolean] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[OauthSession] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    appId: String = null,
    cookie: js.UndefOr[Boolean] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    session: OauthSession = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[InitOptions]
  }
}

