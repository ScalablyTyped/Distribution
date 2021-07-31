package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateBackOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateBackCompleteCallback] = js.undefined
  
  /** 返回的页面数，如果 delta 大于现有页面数，则返回到首页。 */
  var delta: Double
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateBackFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateBackSuccessCallback] = js.undefined
}
object NavigateBackOption {
  
  @scala.inline
  def apply(delta: Double): NavigateBackOption = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateBackOption]
  }
  
  @scala.inline
  implicit class NavigateBackOptionMutableBuilder[Self <: NavigateBackOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
