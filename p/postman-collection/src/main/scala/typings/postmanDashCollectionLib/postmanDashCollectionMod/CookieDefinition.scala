package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieDefinition extends js.Object {
  var domain: java.lang.String
  var expires: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var extensions: js.UndefOr[js.Array[postmanDashCollectionLib.Anon_Key]] = js.undefined
  var hostOnly: js.UndefOr[scala.Boolean] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var path: java.lang.String
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CookieDefinition {
  @scala.inline
  def apply(
    domain: java.lang.String,
    path: java.lang.String,
    expires: java.lang.String | stdLib.Date = null,
    extensions: js.Array[postmanDashCollectionLib.Anon_Key] = null,
    hostOnly: js.UndefOr[scala.Boolean] = js.undefined,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    maxAge: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
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

