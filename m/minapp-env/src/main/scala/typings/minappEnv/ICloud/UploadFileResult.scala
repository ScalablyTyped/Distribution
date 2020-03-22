package typings.minappEnv.ICloud

import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileResult extends IAPISuccessParam {
  var fileID: String
  var statusCode: Double
}

object UploadFileResult {
  @scala.inline
  def apply(errMsg: String, fileID: String, statusCode: Double): UploadFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadFileResult]
  }
}

