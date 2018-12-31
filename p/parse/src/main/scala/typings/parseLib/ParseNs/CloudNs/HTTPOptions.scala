package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPOptions extends js.Object {
  /**
    * The body of the request.
    * If it is a JSON object, then the Content-Type set in the headers must be application/x-www-form-urlencoded or application/json.
    * You can also set this to a Buffer object to send raw bytes.
    * If you use a Buffer, you should also set the Content-Type header explicitly to describe what these bytes represent.
    */
  var body: js.UndefOr[java.lang.String | nodeLib.Buffer | parseLib.ParseNs.Object] = js.undefined
  var error: js.UndefOr[js.Function1[/* response */ js.Any, scala.Unit]] = js.undefined
  /**
    * Defaults to 'false'.
    */
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The headers for the request.
    */
  var headers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  ] = js.undefined
  /**
    *The method of the request (i.e GET, POST, etc).
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The query portion of the url.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ js.Any, scala.Unit]] = js.undefined
  /**
    * The url to send the request to.
    */
  var url: java.lang.String
}

