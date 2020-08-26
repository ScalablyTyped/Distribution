package typings.pinoStdSerializers.mod

import typings.node.httpMod.ServerResponse
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedResponse extends js.Object {
  /**
    * The headers to be sent in the response.
    */
  var headers: Record[String, String] = js.native
  /**
    * Non-enumerable, i.e. will not be in the output, original response object. This is available for subsequent serializers to use.
    */
  var raw: ServerResponse = js.native
  /**
    * HTTP status code.
    */
  var statusCode: Double = js.native
}

object SerializedResponse {
  @scala.inline
  def apply(headers: Record[String, String], raw: ServerResponse, statusCode: Double): SerializedResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedResponse]
  }
  @scala.inline
  implicit class SerializedResponseOps[Self <: SerializedResponse] (val x: Self) extends AnyVal {
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
    def setRaw(value: ServerResponse): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

