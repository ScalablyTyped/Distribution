package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.high
import typings.minappEnv.minappEnvStrings.low
import typings.minappEnv.minappEnvStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakePhotoOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TakePhotoCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TakePhotoFailCallback] = js.undefined
  
  /** 成像质量
    *
    * 可选值：
    * - 'high': 高质量;
    * - 'normal': 普通质量;
    * - 'low': 低质量; */
  var quality: js.UndefOr[high | normal | low] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TakePhotoSuccessCallback] = js.undefined
}
object TakePhotoOption {
  
  inline def apply(): TakePhotoOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakePhotoOption]
  }
  
  extension [Self <: TakePhotoOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setQuality(value: high | normal | low): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSuccess(value: /* result */ TakePhotoSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
