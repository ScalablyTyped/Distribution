package typings.pinoStdSerializers.mod

import typings.node.httpMod.IncomingMessage
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedRequest extends js.Object {
  /**
    * Reference to the `headers` object from the request (as per req.headers in core HTTP).
    */
  var headers: Record[String, String] = js.native
  /**
    * Defaults to `undefined`, unless there is an `id` property already attached to the `request` object or
    * to the `request.info` object. Attach a synchronous function to the `request.id` that returns an
    * identifier to have the value filled.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * HTTP method.
    */
  var method: String = js.native
  /**
    * Non-enumerable, i.e. will not be in the output, original request object. This is available for subsequent
    * serializers to use. In cases where the `request` input already has  a `raw` property this will
    * replace the original `request.raw` property.
    */
  var raw: IncomingMessage = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  /**
    * Request pathname (as per req.url in core HTTP).
    */
  var url: String = js.native
}

object SerializedRequest {
  @scala.inline
  def apply(
    headers: Record[String, String],
    method: String,
    raw: IncomingMessage,
    remoteAddress: String,
    remotePort: Double,
    url: String
  ): SerializedRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedRequest]
  }
  @scala.inline
  implicit class SerializedRequestOps[Self <: SerializedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: IncomingMessage): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAddress(value: String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: Double): Self = this.set("remotePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

