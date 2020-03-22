package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadFileSuccessResult extends CommonAPIResult {
  var data: String
  var statusCode: Double
}

object IUploadFileSuccessResult {
  @scala.inline
  def apply(data: String, errMsg: String, statusCode: Double): IUploadFileSuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUploadFileSuccessResult]
  }
}

