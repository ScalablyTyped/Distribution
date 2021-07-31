package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemManagerGetFileInfoOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[FileSystemManagerGetFileInfoCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[FileSystemManagerGetFileInfoFailCallback] = js.undefined
  
  /** 要读取的文件路径 */
  var filePath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[FileSystemManagerGetFileInfoSuccessCallback] = js.undefined
}
object FileSystemManagerGetFileInfoOption {
  
  @scala.inline
  def apply(filePath: String): FileSystemManagerGetFileInfoOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetFileInfoOption]
  }
  
  @scala.inline
  implicit class FileSystemManagerGetFileInfoOptionMutableBuilder[Self <: FileSystemManagerGetFileInfoOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ GetFileInfoFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ FileSystemManagerGetFileInfoSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
