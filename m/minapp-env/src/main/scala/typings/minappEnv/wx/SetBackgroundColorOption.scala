package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBackgroundColorOption extends StObject {
  
  /** 窗口的背景色，必须为十六进制颜色值 */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /** 底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持 */
  var backgroundColorBottom: js.UndefOr[String] = js.undefined
  
  /** 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持 */
  var backgroundColorTop: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetBackgroundColorCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetBackgroundColorFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetBackgroundColorSuccessCallback] = js.undefined
}
object SetBackgroundColorOption {
  
  @scala.inline
  def apply(): SetBackgroundColorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBackgroundColorOption]
  }
  
  @scala.inline
  implicit class SetBackgroundColorOptionMutableBuilder[Self <: SetBackgroundColorOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottomUndefined: Self = StObject.set(x, "backgroundColorBottom", js.undefined)
    
    @scala.inline
    def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTopUndefined: Self = StObject.set(x, "backgroundColorTop", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
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
