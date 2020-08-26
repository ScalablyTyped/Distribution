package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadFileSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
  /** 临时文件路径。如果没传入 filePath 指定文件存储路径，则下载后的文件会存储到一个临时文件 */
  var tempFilePath: String = js.native
}

object DownloadFileSuccessCallbackResult {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): DownloadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileSuccessCallbackResult]
  }
  @scala.inline
  implicit class DownloadFileSuccessCallbackResultOps[Self <: DownloadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
  }
  
}

