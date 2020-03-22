package typings.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDetails extends js.Object {
  /** Optional. The domain of the cookie. If omitted, the cookie becomes a host-only cookie.  */
  var domain: js.UndefOr[String] = js.undefined
  /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.  */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /** Optional. Whether the cookie should be marked as HttpOnly. Defaults to false.  */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /** Optional. The name of the cookie. Empty by default if omitted.  */
  var name: js.UndefOr[String] = js.undefined
  /** Optional. The path of the cookie. Defaults to the path portion of the url parameter.  */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Optional. The cookie's same-site status. Defaults to "unspecified", i.e., if omitted, the cookie is set without specifying a SameSite attribute.
    * @since Chrome 51.
    */
  var sameSite: js.UndefOr[typings.chrome.chrome.cookies.SameSiteStatus] = js.undefined
  /** Optional. Whether the cookie should be marked as Secure. Defaults to false.  */
  var secure: js.UndefOr[Boolean] = js.undefined
  /** Optional. The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.  */
  var storeId: js.UndefOr[String] = js.undefined
  /** The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail. */
  var url: String
  /** Optional. The value of the cookie. Empty by default if omitted.  */
  var value: js.UndefOr[String] = js.undefined
}

object SetDetails {
  @scala.inline
  def apply(
    url: String,
    domain: String = null,
    expirationDate: Int | Double = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    path: String = null,
    sameSite: typings.chrome.chrome.cookies.SameSiteStatus = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    storeId: String = null,
    value: String = null
  ): SetDetails = {
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
    __obj.asInstanceOf[SetDetails]
  }
}

