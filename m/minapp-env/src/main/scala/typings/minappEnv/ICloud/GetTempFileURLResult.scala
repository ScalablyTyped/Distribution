package typings.minappEnv.ICloud

import typings.minappEnv.Array
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileURLResult extends IAPISuccessParam {
  var fileList: Array[GetTempFileURLResultItem]
}

object GetTempFileURLResult {
  @scala.inline
  def apply(errMsg: String, fileList: Array[GetTempFileURLResultItem]): GetTempFileURLResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLResult]
  }
}

