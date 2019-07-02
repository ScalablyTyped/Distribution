package typings
package pinoDashStdDashSerializersLib.pinoDashStdDashSerializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedRequest extends js.Object {
  /**
    * Reference to the `headers` object from the request (as per req.headers in core HTTP).
    */
  var headers: stdLib.Record[java.lang.String, java.lang.String]
  /**
    * Defaults to `undefined`, unless there is an `id` property already attached to the `request` object or
    * to the `request.info` object. Attach a synchronous function to the `request.id` that returns an
    * identifier to have the value filled.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTTP method.
    */
  var method: java.lang.String
  /**
    * Non-enumerable, i.e. will not be in the output, original request object. This is available for subsequent
    * serializers to use. In cases where the `request` input already has  a `raw` property this will
    * replace the original `request.raw` property.
    */
  var raw: nodeLib.httpMod.IncomingMessage
  var remoteAddress: java.lang.String
  var remotePort: scala.Double
  /**
    * Request pathname (as per req.url in core HTTP).
    */
  var url: java.lang.String
}

object SerializedRequest {
  @scala.inline
  def apply(
    headers: stdLib.Record[java.lang.String, java.lang.String],
    method: java.lang.String,
    raw: nodeLib.httpMod.IncomingMessage,
    remoteAddress: java.lang.String,
    remotePort: scala.Double,
    url: java.lang.String,
    id: java.lang.String = null
  ): SerializedRequest = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, raw = raw, remoteAddress = remoteAddress, remotePort = remotePort, url = url)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[SerializedRequest]
  }
}

