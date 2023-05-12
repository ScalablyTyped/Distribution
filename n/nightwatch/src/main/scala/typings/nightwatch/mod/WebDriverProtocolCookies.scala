package typings.nightwatch.mod

import typings.nightwatch.nightwatchStrings.DELETE
import typings.nightwatch.nightwatchStrings.GET
import typings.nightwatch.nightwatchStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolCookies extends StObject {
  
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
  def cookie(method: GET | DELETE): Awaitable[this.type, js.Array[Cookie] | Null] = js.native
  def cookie(
    method: GET | DELETE,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Cookie] | Null], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[Cookie] | Null] = js.native
  @JSName("cookie")
  def cookie_DELETE(method: DELETE, cookieName: String): Awaitable[this.type, Null] = js.native
  @JSName("cookie")
  def cookie_DELETE(
    method: DELETE,
    cookieName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("cookie")
  def cookie_POST(method: POST, cookie: Cookie): Awaitable[this.type, Null] = js.native
  @JSName("cookie")
  def cookie_POST(
    method: POST,
    cookie: Cookie,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
