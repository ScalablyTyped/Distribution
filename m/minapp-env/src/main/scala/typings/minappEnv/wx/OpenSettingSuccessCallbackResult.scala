package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSettingSuccessCallbackResult extends StObject {
  
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting
}
object OpenSettingSuccessCallbackResult {
  
  inline def apply(authSetting: AuthSetting): OpenSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettingSuccessCallbackResult]
  }
  
  extension [Self <: OpenSettingSuccessCallbackResult](x: Self) {
    
    inline def setAuthSetting(value: AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
