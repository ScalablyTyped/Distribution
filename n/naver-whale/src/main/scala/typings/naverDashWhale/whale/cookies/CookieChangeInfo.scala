package typings.naverDashWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieChangeInfo extends js.Object {
  /**
    * Since Chrome 12.
    * The underlying reason behind the cookie's change.
    */
  var cause: String
  /** Information about the cookie that was set or removed. */
  var cookie: typings.chrome.chrome.cookies.Cookie
  /** True if a cookie was removed. */
  var removed: Boolean
}

object CookieChangeInfo {
  @scala.inline
  def apply(cause: String, cookie: typings.chrome.chrome.cookies.Cookie, removed: Boolean): CookieChangeInfo = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookieChangeInfo]
  }
}

