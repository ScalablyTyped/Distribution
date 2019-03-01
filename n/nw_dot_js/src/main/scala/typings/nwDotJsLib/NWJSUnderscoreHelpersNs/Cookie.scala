package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information about an HTTP cookie.
  */
trait Cookie extends js.Object {
  /**
    * The domain of the cookie (e.g. "www.google.com", "example.com").
    */
  var domain: java.lang.String
  /**
    * (Optional) The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /**
    * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
    */
  var hostOnly: scala.Boolean
  /**
    * True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts).
    */
  var httpOnly: scala.Boolean
  /**
    * The name of the cookie.
    */
  var name: java.lang.String
  /**
    * The path of the cookie.
    */
  var path: java.lang.String
  /**
    * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
    */
  var sameSite: java.lang.String | nwDotJsLib.nwDotJsLibStrings.no_restriction | nwDotJsLib.nwDotJsLibStrings.lax | nwDotJsLib.nwDotJsLibStrings.strict
  /**
    * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
    */
  var secure: scala.Boolean
  /**
    * True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date.
    */
  var session: scala.Boolean
  /**
    * The ID of the cookie store containing this cookie.
    */
  var storeId: java.lang.String
  /**
    * The value of the cookie.
    */
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    hostOnly: scala.Boolean,
    httpOnly: scala.Boolean,
    name: java.lang.String,
    path: java.lang.String,
    sameSite: java.lang.String | nwDotJsLib.nwDotJsLibStrings.no_restriction | nwDotJsLib.nwDotJsLibStrings.lax | nwDotJsLib.nwDotJsLibStrings.strict,
    secure: scala.Boolean,
    session: scala.Boolean,
    storeId: java.lang.String,
    value: java.lang.String,
    expirationDate: scala.Int | scala.Double = null
  ): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("hostOnly")(hostOnly)
    __obj.updateDynamic("httpOnly")(httpOnly)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("storeId")(storeId)
    __obj.updateDynamic("value")(value)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

