package typings.minappEnv.ICloud

import typings.minappEnv.Array
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === end ===
// === API: deleteFile ===
trait DeleteFileResult extends IAPISuccessParam {
  var fileList: Array[DeleteFileResultItem]
}

object DeleteFileResult {
  @scala.inline
  def apply(errMsg: String, fileList: Array[DeleteFileResultItem]): DeleteFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFileResult]
  }
}

