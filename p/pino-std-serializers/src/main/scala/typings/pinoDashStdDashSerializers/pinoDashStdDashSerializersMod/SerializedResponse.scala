package typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod

import typings.node.httpMod.ServerResponse
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedResponse extends js.Object {
  /**
    * The headers to be sent in the response.
    */
  var headers: Record[String, String]
  /**
    * Non-enumerable, i.e. will not be in the output, original response object. This is available for subsequent serializers to use.
    */
  var raw: ServerResponse
  /**
    * HTTP status code.
    */
  var statusCode: Double
}

object SerializedResponse {
  @scala.inline
  def apply(headers: Record[String, String], raw: ServerResponse, statusCode: Double): SerializedResponse = {
    val __obj = js.Dynamic.literal(headers = headers, raw = raw, statusCode = statusCode)
  
    __obj.asInstanceOf[SerializedResponse]
  }
}

