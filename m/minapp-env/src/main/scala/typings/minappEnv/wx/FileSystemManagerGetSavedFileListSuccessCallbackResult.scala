package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemManagerGetSavedFileListSuccessCallbackResult extends StObject {
  
  /** 文件数组 */
  var fileList: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem
}
object FileSystemManagerGetSavedFileListSuccessCallbackResult {
  
  inline def apply(fileList: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem): FileSystemManagerGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetSavedFileListSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemManagerGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setFileList(value: FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
