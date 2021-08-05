package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowModalOption extends StObject {
  
  /** 取消按钮的文字颜色，必须是 16 进制格式的颜色字符串 */
  var cancelColor: js.UndefOr[String] = js.undefined
  
  /** 取消按钮的文字，最多 4 个字符 */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowModalCompleteCallback] = js.undefined
  
  /** 确认按钮的文字颜色，必须是 16 进制格式的颜色字符串 */
  var confirmColor: js.UndefOr[String] = js.undefined
  
  /** 确认按钮的文字，最多 4 个字符 */
  var confirmText: js.UndefOr[String] = js.undefined
  
  /** 提示的内容 */
  var content: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowModalFailCallback] = js.undefined
  
  /** 是否显示取消按钮 */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowModalSuccessCallback] = js.undefined
  
  /** 提示的标题 */
  var title: String
}
object ShowModalOption {
  
  inline def apply(content: String, title: String): ShowModalOption = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalOption]
  }
  
  extension [Self <: ShowModalOption](x: Self) {
    
    inline def setCancelColor(value: String): Self = StObject.set(x, "cancelColor", value.asInstanceOf[js.Any])
    
    inline def setCancelColorUndefined: Self = StObject.set(x, "cancelColor", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setConfirmColor(value: String): Self = StObject.set(x, "confirmColor", value.asInstanceOf[js.Any])
    
    inline def setConfirmColorUndefined: Self = StObject.set(x, "confirmColor", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    inline def setSuccess(value: /* result */ ShowModalSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
