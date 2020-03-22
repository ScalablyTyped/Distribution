package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemManagerSaveFileSuccessCallbackResult extends js.Object {
  /** 存储后的文件路径 */
  var savedFilePath: Double
}

object FileSystemManagerSaveFileSuccessCallbackResult {
  @scala.inline
  def apply(savedFilePath: Double): FileSystemManagerSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystemManagerSaveFileSuccessCallbackResult]
  }
}

