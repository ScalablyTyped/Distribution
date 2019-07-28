package typings.naverDashWhale.whaleNs.cookiesNs

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
  var cookie: typings.chrome.chromeNs.cookiesNs.Cookie
  /** True if a cookie was removed. */
  var removed: Boolean
}

object CookieChangeInfo {
  @scala.inline
  def apply(cause: String, cookie: typings.chrome.chromeNs.cookiesNs.Cookie, removed: Boolean): CookieChangeInfo = {
    val __obj = js.Dynamic.literal(cause = cause, cookie = cookie, removed = removed)
  
    __obj.asInstanceOf[CookieChangeInfo]
  }
}

