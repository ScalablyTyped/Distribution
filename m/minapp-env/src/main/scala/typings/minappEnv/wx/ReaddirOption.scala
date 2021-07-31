package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReaddirCompleteCallback] = js.undefined
  
  /** 要读取的目录路径 */
  var dirPath: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ReaddirFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReaddirSuccessCallback] = js.undefined
}
object ReaddirOption {
  
  @scala.inline
  def apply(dirPath: String): ReaddirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirOption]
  }
  
  @scala.inline
  implicit class ReaddirOptionMutableBuilder[Self <: ReaddirOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* result */ ReaddirFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ReaddirSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
