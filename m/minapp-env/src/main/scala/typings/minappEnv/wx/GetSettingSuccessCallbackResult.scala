package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSettingSuccessCallbackResult extends js.Object {
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting
}

object GetSettingSuccessCallbackResult {
  @scala.inline
  def apply(authSetting: AuthSetting): GetSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSettingSuccessCallbackResult]
  }
}

