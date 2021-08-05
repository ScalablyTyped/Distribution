package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CopyFileCompleteCallback] = js.undefined
  
  /** 目标文件路径 */
  var destPath: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CopyFileFailCallback] = js.undefined
  
  /** 源文件路径，只可以是普通文件 */
  var srcPath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CopyFileSuccessCallback] = js.undefined
}
object CopyFileOption {
  
  inline def apply(destPath: String, srcPath: String): CopyFileOption = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileOption]
  }
  
  extension [Self <: CopyFileOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDestPath(value: String): Self = StObject.set(x, "destPath", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* result */ CopyFileFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
