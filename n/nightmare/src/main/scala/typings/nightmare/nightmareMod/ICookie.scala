package typings.nightmare.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[Double] = js.undefined
  var hostOnly: js.UndefOr[Boolean] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var value: String
}

object ICookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expirationDate: Int | Double = null,
    hostOnly: js.UndefOr[Boolean] = js.undefined,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): ICookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
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

