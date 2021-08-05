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
  
  inline def apply(): SetBackgroundColorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBackgroundColorOption]
  }
  
  extension [Self <: SetBackgroundColorOption](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorBottomUndefined: Self = StObject.set(x, "backgroundColorBottom", js.undefined)
    
    inline def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorTopUndefined: Self = StObject.set(x, "backgroundColorTop", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
