package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的数据 */
  var data: String | js.Object | ArrayBuffer
  /** 开发者服务器返回的 HTTP Response Header
    *
    * 最低基础库： `1.2.0` */
  var header: js.Object
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
}

object RequestSuccessCallbackResult {
  @scala.inline
  def apply(data: String | js.Object | ArrayBuffer, header: js.Object, statusCode: Double): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
}

