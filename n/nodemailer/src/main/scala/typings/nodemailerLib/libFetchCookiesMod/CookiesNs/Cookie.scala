package typings
package nodemailerLib.libFetchCookiesMod.CookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  var httponly: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Cookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    domain: java.lang.String = null,
    expires: stdLib.Date = null,
    httponly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
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

