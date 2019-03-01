package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  var hostOnly: js.UndefOr[scala.Boolean] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object ICookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expirationDate: scala.Int | scala.Double = null,
    hostOnly: js.UndefOr[scala.Boolean] = js.undefined,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): ICookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(hostOnly)) __obj.updateDynamic("hostOnly")(hostOnly)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ICookie]
  }
}

