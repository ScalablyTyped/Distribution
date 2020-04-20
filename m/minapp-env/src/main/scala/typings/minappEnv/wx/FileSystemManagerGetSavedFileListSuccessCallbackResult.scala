package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemManagerGetSavedFileListSuccessCallbackResult extends js.Object {
  /** 文件数组 */
  var fileList: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem
}

object FileSystemManagerGetSavedFileListSuccessCallbackResult {
  @scala.inline
  def apply(fileList: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem): FileSystemManagerGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetSavedFileListSuccessCallbackResult]
  }
}

