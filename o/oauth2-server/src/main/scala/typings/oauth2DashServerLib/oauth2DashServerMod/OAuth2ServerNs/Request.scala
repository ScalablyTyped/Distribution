package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents an incoming HTTP request.
     */

trait Request extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
           * Returns the specified HTTP header field. The match is case-insensitive.
           *
           */
  def get(field: java.lang.String): js.UndefOr[_]
  /**
           * Checks if the request’s Content-Type HTTP header matches any of the given MIME types.
           *
           */
  def is(types: js.Array[java.lang.String]): java.lang.String | oauth2DashServerLib.oauth2DashServerLibNumbers.`false`
}

