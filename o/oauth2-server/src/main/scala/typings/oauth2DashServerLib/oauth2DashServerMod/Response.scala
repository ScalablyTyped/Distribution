package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an outgoing HTTP response.
  */
@JSImport("oauth2-server", "Response")
@js.native
/**
  * Instantiates Response using the supplied options.
  *
  */
class Response () extends js.Object {
  def this(options: expressLib.expressMod.Response) = this()
  def this(options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  var body: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  var status: js.UndefOr[scala.Double] = js.native
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: java.lang.String): js.UndefOr[_] = js.native
  /**
    * Redirects to the specified URL using 302 Found.
    *
    */
  def redirect(url: java.lang.String): scala.Unit = js.native
  /**
    * Sets the specified HTTP header field. The match is case-insensitive.
    *
    */
  def set(field: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

