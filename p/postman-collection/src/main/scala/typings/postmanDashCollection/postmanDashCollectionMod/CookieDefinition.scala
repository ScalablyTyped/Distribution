package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Key
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieDefinition extends js.Object {
  var domain: String
  var expires: js.UndefOr[String | Date] = js.undefined
  var extensions: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  var hostOnly: js.UndefOr[Boolean] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var path: String
  var secure: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CookieDefinition {
  @scala.inline
  def apply(
    domain: String,
    path: String,
    expires: String | Date = null,
    extensions: js.Array[Anon_Key] = null,
    hostOnly: js.UndefOr[Boolean] = js.undefined,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxAge: Int | Double = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): CookieDefinition = {
    val __obj = js.Dynamic.literal(domain = domain, path = path)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(hostOnly)) __obj.updateDynamic("hostOnly")(hostOnly)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CookieDefinition]
  }
}

