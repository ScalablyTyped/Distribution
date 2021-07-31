package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTabBarItemOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetTabBarItemCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetTabBarItemFailCallback] = js.undefined
  
  /** 图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px，当 postion 为 top 时，此参数无效，不支持网络图片 */
  var iconPath: js.UndefOr[String] = js.undefined
  
  /** tabBar 的哪一项，从左边算起 */
  var index: Double
  
  /** 选中时的图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px ，当 postion 为 top 时，此参数无效 */
  var selectedIconPath: js.UndefOr[String] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetTabBarItemSuccessCallback] = js.undefined
  
  /** tab 上的按钮文字 */
  var text: js.UndefOr[String] = js.undefined
}
object SetTabBarItemOption {
  
  @scala.inline
  def apply(index: Double): SetTabBarItemOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOption]
  }
  
  @scala.inline
  implicit class SetTabBarItemOptionMutableBuilder[Self <: SetTabBarItemOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconPath(value: String): Self = StObject.set(x, "selectedIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconPathUndefined: Self = StObject.set(x, "selectedIconPath", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
