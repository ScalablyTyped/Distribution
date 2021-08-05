package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSettingSuccessCallbackResult extends StObject {
  
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting
}
object GetSettingSuccessCallbackResult {
  
  inline def apply(authSetting: AuthSetting): GetSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSettingSuccessCallbackResult]
  }
  
  extension [Self <: GetSettingSuccessCallbackResult](x: Self) {
    
    inline def setAuthSetting(value: AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
