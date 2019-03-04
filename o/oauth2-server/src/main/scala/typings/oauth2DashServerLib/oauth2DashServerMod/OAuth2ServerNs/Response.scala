package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an outgoing HTTP response.
  */
trait Response extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: java.lang.String): js.UndefOr[_]
  /**
    * Redirects to the specified URL using 302 Found.
    *
    */
  def redirect(url: java.lang.String): scala.Unit
  /**
    * Sets the specified HTTP header field. The match is case-insensitive.
    *
    */
  def set(field: java.lang.String, value: java.lang.String): scala.Unit
}

object Response {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, js.UndefOr[_]],
    redirect: js.Function1[java.lang.String, scala.Unit],
    set: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    body: js.Any = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    status: scala.Int | scala.Double = null
  ): Response = {
    val __obj = js.Dynamic.literal(get = get, redirect = redirect, set = set)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

