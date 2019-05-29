package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an incoming HTTP request.
  */
@JSImport("oauth2-server", "Request")
@js.native
/**
  * Instantiates Request using the supplied options.
  *
  */
class Request () extends js.Object {
  def this(options: expressLib.expressMod.Request) = this()
  def this(options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  var body: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  var method: js.UndefOr[java.lang.String] = js.native
  var query: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: java.lang.String): js.UndefOr[js.Any] = js.native
  /**
    * Checks if the request’s Content-Type HTTP header matches any of the given MIME types.
    *
    */
  def is(types: js.Array[java.lang.String]): java.lang.String | oauth2DashServerLib.oauth2DashServerLibNumbers.`false` = js.native
}

