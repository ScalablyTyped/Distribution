package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RenameCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RenameFailCallback] = js.undefined
  
  /** 新文件路径 */
  var newPath: String
  
  /** 源文件路径，可以是普通文件或目录 */
  var oldPath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RenameSuccessCallback] = js.undefined
}
object RenameOption {
  
  @scala.inline
  def apply(newPath: String, oldPath: String): RenameOption = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOption]
  }
  
  @scala.inline
  implicit class RenameOptionMutableBuilder[Self <: RenameOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ RenameFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
