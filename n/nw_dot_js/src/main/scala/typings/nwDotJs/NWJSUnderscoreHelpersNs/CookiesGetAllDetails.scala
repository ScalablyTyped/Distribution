package typings.nwDotJs.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.getAll() details argument object
  */
trait CookiesGetAllDetails extends js.Object {
  /**
    * Restricts the retrieved cookies to those whose domains match or are subdomains of this one.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Filters the cookies by name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Restricts the retrieved cookies to those whose path exactly matches this string.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Filters the cookies by their Secure property.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * Filters out session vs. persistent cookies.
    */
  var session: Boolean
  /**
    * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.
    */
  var storeId: js.UndefOr[String] = js.undefined
  /**
    * Restricts the retrieved cookies to those that would match the given URL.
    */
  var url: js.UndefOr[String] = js.undefined
}

object CookiesGetAllDetails {
  @scala.inline
  def apply(
    session: Boolean,
    domain: String = null,
    name: String = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    storeId: String = null,
    url: String = null
  ): CookiesGetAllDetails = {
    val __obj = js.Dynamic.literal(session = session)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CookiesGetAllDetails]
  }
}

