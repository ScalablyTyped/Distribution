package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownloadFileSuccessResult extends CommonAPIResult {
  var statusCode: Double
  var tempFilePath: String
}

object IDownloadFileSuccessResult {
  @scala.inline
  def apply(errMsg: String, statusCode: Double, tempFilePath: String): IDownloadFileSuccessResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDownloadFileSuccessResult]
  }
}

