package typings
package pinoDashStdDashSerializersLib.pinoDashStdDashSerializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedResponse extends js.Object {
  /**
    * The headers to be sent in the response.
    */
  var headers: stdLib.Record[java.lang.String, java.lang.String]
  /**
    * Non-enumerable, i.e. will not be in the output, original response object. This is available for subsequent serializers to use.
    */
  var raw: nodeLib.httpMod.ServerResponse
  /**
    * HTTP status code.
    */
  var statusCode: scala.Double
}

object SerializedResponse {
  @scala.inline
  def apply(
    headers: stdLib.Record[java.lang.String, java.lang.String],
    raw: nodeLib.httpMod.ServerResponse,
    statusCode: scala.Double
  ): SerializedResponse = {
    val __obj = js.Dynamic.literal(headers = headers, raw = raw, statusCode = statusCode)
  
    __obj.asInstanceOf[SerializedResponse]
  }
}

