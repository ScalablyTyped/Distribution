package typings.minappEnv.ICloud

import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileResult extends IAPISuccessParam {
  var statusCode: Double
  var tempFilePath: String
}

object DownloadFileResult {
  @scala.inline
  def apply(errMsg: String, statusCode: Double, tempFilePath: String): DownloadFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadFileResult]
  }
}

