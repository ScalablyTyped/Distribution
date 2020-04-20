package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTaskOnProgressUpdateCallbackResult extends js.Object {
  /** 上传进度百分比 */
  var progress: Double
  /** 预期需要上传的数据总长度，单位 Bytes */
  var totalBytesExpectedToSend: Double
  /** 已经上传的数据长度，单位 Bytes */
  var totalBytesSent: Double
}

object UploadTaskOnProgressUpdateCallbackResult {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): UploadTaskOnProgressUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskOnProgressUpdateCallbackResult]
  }
}

