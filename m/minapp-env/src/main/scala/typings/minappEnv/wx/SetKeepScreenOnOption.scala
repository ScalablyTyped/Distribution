package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetKeepScreenOnOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetKeepScreenOnCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetKeepScreenOnFailCallback] = js.undefined
  
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetKeepScreenOnSuccessCallback] = js.undefined
}
object SetKeepScreenOnOption {
  
  @scala.inline
  def apply(keepScreenOn: Boolean): SetKeepScreenOnOption = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnOption]
  }
  
  @scala.inline
  implicit class SetKeepScreenOnOptionMutableBuilder[Self <: SetKeepScreenOnOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
