package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFileSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的数据 */
  var data: String = js.native
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
}

object UploadFileSuccessCallbackResult {
  @scala.inline
  def apply(data: String, statusCode: Double): UploadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileSuccessCallbackResult]
  }
  @scala.inline
  implicit class UploadFileSuccessCallbackResultOps[Self <: UploadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

