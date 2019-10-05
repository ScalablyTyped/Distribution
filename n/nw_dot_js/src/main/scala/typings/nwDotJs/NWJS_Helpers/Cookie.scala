package typings.nwDotJs.NWJS_Helpers

import typings.nwDotJs.nwDotJsStrings.lax
import typings.nwDotJs.nwDotJsStrings.no_restriction
import typings.nwDotJs.nwDotJsStrings.strict
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
  var domain: String
  /**
    * (Optional) The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /**
    * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
    */
  var hostOnly: Boolean
  /**
    * True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts).
    */
  var httpOnly: Boolean
  /**
    * The name of the cookie.
    */
  var name: String
  /**
    * The path of the cookie.
    */
  var path: String
  /**
    * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
    */
  var sameSite: String | no_restriction | lax | strict
  /**
    * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
    */
  var secure: Boolean
  /**
    * True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date.
    */
  var session: Boolean
  /**
    * The ID of the cookie store containing this cookie.
    */
  var storeId: String
  /**
    * The value of the cookie.
    */
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    hostOnly: Boolean,
    httpOnly: Boolean,
    name: String,
    path: String,
    sameSite: String | no_restriction | lax | strict,
    secure: Boolean,
    session: Boolean,
    storeId: String,
    value: String,
    expirationDate: Int | Double = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, hostOnly = hostOnly, httpOnly = httpOnly, name = name, path = path, sameSite = sameSite.asInstanceOf[js.Any], secure = secure, session = session, storeId = storeId, value = value)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

