package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxGetSavedFileListSuccessCallbackResult extends StObject {
  
  /** 文件数组，每一项是一个 FileItem */
  var fileList: WxGetSavedFileListSuccessCallbackResultFileItem = js.native
}
object WxGetSavedFileListSuccessCallbackResult {
  
  @scala.inline
  def apply(fileList: WxGetSavedFileListSuccessCallbackResultFileItem): WxGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetSavedFileListSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class WxGetSavedFileListSuccessCallbackResultMutableBuilder[Self <: WxGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileList(value: WxGetSavedFileListSuccessCallbackResultFileItem): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
