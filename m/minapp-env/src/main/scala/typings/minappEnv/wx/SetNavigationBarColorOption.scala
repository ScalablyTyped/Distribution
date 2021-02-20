package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNavigationBarColorOption extends StObject {
  
  /** 动画效果 */
  var animation: AnimationOption = js.native
  
  /** 背景颜色值，有效值为十六进制颜色 */
  var backgroundColor: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetNavigationBarColorCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetNavigationBarColorFailCallback] = js.native
  
  /** 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000 */
  var frontColor: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetNavigationBarColorSuccessCallback] = js.native
}
object SetNavigationBarColorOption {
  
  @scala.inline
  def apply(animation: AnimationOption, backgroundColor: String, frontColor: String): SetNavigationBarColorOption = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarColorOption]
  }
  
  @scala.inline
  implicit class SetNavigationBarColorOptionMutableBuilder[Self <: SetNavigationBarColorOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationOption): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFrontColor(value: String): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
