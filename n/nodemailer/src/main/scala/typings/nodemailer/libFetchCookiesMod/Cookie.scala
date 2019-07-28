package typings.nodemailer.libFetchCookiesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Date] = js.undefined
  var httponly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Cookie {
  @scala.inline
  def apply(
    name: String,
    domain: String = null,
    expires: Date = null,
    httponly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Cookie]
  }
}

