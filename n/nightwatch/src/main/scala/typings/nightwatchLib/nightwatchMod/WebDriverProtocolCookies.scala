package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolCookies extends js.Object {
  /**
    * Retrieve or delete all cookies visible to the current page or set a cookie. Normally this shouldn't be used directly, instead the cookie convenience methods should be used:
    * <code>getCookie</code>, <code>getCookies</code>, <code>setCookie</code>, <code>deleteCookie</code>, <code>deleteCookies</code>.
    *
    * @see getCookies
    * @see getCookie
    * @see setCookie
    * @see deleteCookie
    * @see deleteCookies
    */
  def cookie(method: java.lang.String): this.type = js.native
  def cookie(method: java.lang.String, callbackOrCookie: js.Function0[scala.Unit]): this.type = js.native
}

