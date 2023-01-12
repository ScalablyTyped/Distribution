package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.game
import typings.minappEnv.minappEnvStrings.normal
import typings.minappEnv.minappEnvStrings.ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAccelerometerOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartAccelerometerCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartAccelerometerFailCallback] = js.undefined
  
  /** 监听加速度数据回调函数的执行频率
    *
    * 可选值：
    * - 'game': 适用于更新游戏的回调频率，在 20ms/次 左右;
    * - 'ui': 适用于更新 UI 的回调频率，在 60ms/次 左右;
    * - 'normal': 普通的回调频率，在 200ms/次 左右;
    *
    * 最低基础库： `2.1.0` */
  var interval: js.UndefOr[game | ui | normal] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartAccelerometerSuccessCallback] = js.undefined
}
object StartAccelerometerOption {
  
  inline def apply(): StartAccelerometerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAccelerometerOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAccelerometerOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setInterval(value: game | ui | normal): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
