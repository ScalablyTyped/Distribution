package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.
    */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the cookie should be marked as HttpOnly. Defaults to false.
    */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the cookie. Empty by default if omitted.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path of the cookie. Defaults to the path portion of the url parameter.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cookie's same-site status: defaults to 'no_restriction'.
    */
  var sameSite: js.UndefOr[
    java.lang.String | nwDotJsLib.nwDotJsLibStrings.no_restriction | nwDotJsLib.nwDotJsLibStrings.lax | nwDotJsLib.nwDotJsLibStrings.strict
  ] = js.undefined
  /**
    * Whether the cookie should be marked as Secure. Defaults to false.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.
    */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The request-URI to associate with the setting of the cookie.
    */
  var url: java.lang.String
  /**
    * The value of the cookie. Empty by default if omitted.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

