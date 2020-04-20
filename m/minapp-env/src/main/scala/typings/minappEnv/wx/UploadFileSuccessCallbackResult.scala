package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的数据 */
  var data: String
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
}

object UploadFileSuccessCallbackResult {
  @scala.inline
  def apply(data: String, statusCode: Double): UploadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileSuccessCallbackResult]
  }
}

