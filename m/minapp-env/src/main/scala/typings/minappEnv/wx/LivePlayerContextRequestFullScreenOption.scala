package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`-90`
import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePlayerContextRequestFullScreenOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestFullScreenCompleteCallback] = js.undefined
  
  /** 设置全屏时的方向
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度; */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFullScreenFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestFullScreenSuccessCallback] = js.undefined
}
object LivePlayerContextRequestFullScreenOption {
  
  inline def apply(): LivePlayerContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivePlayerContextRequestFullScreenOption]
  }
  
  extension [Self <: LivePlayerContextRequestFullScreenOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDirection(value: `0` | `90` | `-90`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
