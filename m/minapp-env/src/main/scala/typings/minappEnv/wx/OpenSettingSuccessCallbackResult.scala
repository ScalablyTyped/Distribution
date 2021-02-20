package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSettingSuccessCallbackResult extends StObject {
  
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting = js.native
}
object OpenSettingSuccessCallbackResult {
  
  @scala.inline
  def apply(authSetting: AuthSetting): OpenSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettingSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class OpenSettingSuccessCallbackResultMutableBuilder[Self <: OpenSettingSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSetting(value: AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
