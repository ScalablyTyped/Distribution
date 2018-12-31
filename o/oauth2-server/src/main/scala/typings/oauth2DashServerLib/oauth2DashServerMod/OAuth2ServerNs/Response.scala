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

