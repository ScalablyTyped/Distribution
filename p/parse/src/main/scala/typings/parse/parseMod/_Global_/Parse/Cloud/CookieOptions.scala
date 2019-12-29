package typings.parse.parseMod._Global_.Parse.Cloud

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Date] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    expires: Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOptions]
  }
}

