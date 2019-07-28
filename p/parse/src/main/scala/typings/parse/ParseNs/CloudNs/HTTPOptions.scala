package typings.parse.ParseNs.CloudNs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.parse.ParseNs.Object
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
  var body: js.UndefOr[String | Buffer | Object] = js.undefined
  var error: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  /**
    * Defaults to 'false'.
    */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  /**
    * The headers for the request.
    */
  var headers: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  /**
    *The method of the request (i.e GET, POST, etc).
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The query portion of the url.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  /**
    * The url to send the request to.
    */
  var url: String
}

object HTTPOptions {
  @scala.inline
  def apply(
    url: String,
    body: String | Buffer | Object = null,
    error: /* response */ js.Any => Unit = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String | Double | Boolean] = null,
    method: String = null,
    params: js.Any = null,
    success: /* response */ js.Any => Unit = null
  ): HTTPOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[HTTPOptions]
  }
}

