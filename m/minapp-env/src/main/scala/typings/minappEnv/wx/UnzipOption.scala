package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UnzipCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UnzipFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UnzipSuccessCallback] = js.undefined
  
  /** 目标目录路径 */
  var targetPath: String
  
  /** 源文件路径，只可以是 zip 压缩文件 */
  var zipFilePath: String
}
object UnzipOption {
  
  inline def apply(targetPath: String, zipFilePath: String): UnzipOption = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnzipOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnzipOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* result */ UnzipFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
    
    inline def setZipFilePath(value: String): Self = StObject.set(x, "zipFilePath", value.asInstanceOf[js.Any])
  }
}
