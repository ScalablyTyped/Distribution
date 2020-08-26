package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemManagerGetSavedFileListSuccessCallbackResult extends js.Object {
  /** 文件数组 */
  var fileList: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem = js.native
}

object FileSystemManagerGetSavedFileListSuccessCallbackResult {
  @scala.inline
  def apply(fileList: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem): FileSystemManagerGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetSavedFileListSuccessCallbackResult]
  }
  @scala.inline
  implicit class FileSystemManagerGetSavedFileListSuccessCallbackResultOps[Self <: FileSystemManagerGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setFileList(value: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

