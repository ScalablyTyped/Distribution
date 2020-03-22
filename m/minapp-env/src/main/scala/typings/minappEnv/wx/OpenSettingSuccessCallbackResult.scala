package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSettingSuccessCallbackResult extends js.Object {
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting
}

object OpenSettingSuccessCallbackResult {
  @scala.inline
  def apply(authSetting: AuthSetting): OpenSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenSettingSuccessCallbackResult]
  }
}

