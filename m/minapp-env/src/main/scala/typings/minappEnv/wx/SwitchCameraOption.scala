package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchCameraOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SwitchCameraCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SwitchCameraFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SwitchCameraSuccessCallback] = js.undefined
}
object SwitchCameraOption {
  
  inline def apply(): SwitchCameraOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchCameraOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchCameraOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
