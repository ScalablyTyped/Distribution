package typings.minappEnv.wx

import typings.minappEnv.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateMarkerOption extends StObject {
  
  /** 动画结束回调函数 */
  var animationEnd: js.UndefOr[Function] = js.undefined
  
  /** 移动过程中是否自动旋转 marker */
  var autoRotate: Boolean
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TranslateMarkerCompleteCallback] = js.undefined
  
  /** 指定 marker 移动到的目标点 */
  var destination: DestinationOption
  
  /** 动画持续时长，平移与旋转分别计算 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TranslateMarkerFailCallback] = js.undefined
  
  /** 指定 marker */
  var markerId: Double
  
  /** marker 的旋转角度 */
  var rotate: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TranslateMarkerSuccessCallback] = js.undefined
}
object TranslateMarkerOption {
  
  @scala.inline
  def apply(autoRotate: Boolean, destination: DestinationOption, markerId: Double, rotate: Double): TranslateMarkerOption = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateMarkerOption]
  }
  
  @scala.inline
  implicit class TranslateMarkerOptionMutableBuilder[Self <: TranslateMarkerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnd(value: Function): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDestination(value: DestinationOption): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
