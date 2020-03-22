package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxGetSavedFileListSuccessCallbackResult extends js.Object {
  /** 文件数组，每一项是一个 FileItem */
  var fileList: WxGetSavedFileListSuccessCallbackResultFileItem
}

object WxGetSavedFileListSuccessCallbackResult {
  @scala.inline
  def apply(fileList: WxGetSavedFileListSuccessCallbackResultFileItem): WxGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WxGetSavedFileListSuccessCallbackResult]
  }
}

