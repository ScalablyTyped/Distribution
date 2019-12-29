package typings.nwDotJs.nwDotJsMod._Global_.NWJS_Helpers

import typings.nwDotJs.nwDotJsStrings.lax
import typings.nwDotJs.nwDotJsStrings.no_restriction
import typings.nwDotJs.nwDotJsStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.set() details argument object
  */
trait CookiesSetDetails extends js.Object {
  /**
    * The domain of the cookie. If omitted, the cookie becomes a host-only cookie.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /**
    * Whether the cookie should be marked as HttpOnly. Defaults to false.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the cookie. Empty by default if omitted.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The path of the cookie. Defaults to the path portion of the url parameter.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The cookie's same-site status: defaults to 'no_restriction'.
    */
  var sameSite: js.UndefOr[String | no_restriction | lax | strict] = js.undefined
  /**
    * Whether the cookie should be marked as Secure. Defaults to false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.undefined
  /**
    * The request-URI to associate with the setting of the cookie.
    */
  var url: String
  /**
    * The value of the cookie. Empty by default if omitted.
    */
  var value: js.UndefOr[String] = js.undefined
}

object CookiesSetDetails {
  @scala.inline
  def apply(
    url: String,
    domain: String = null,
    expirationDate: Int | Double = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    path: String = null,
    sameSite: String | no_restriction | lax | strict = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    storeId: String = null,
    value: String = null
  ): CookiesSetDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesSetDetails]
  }
}

