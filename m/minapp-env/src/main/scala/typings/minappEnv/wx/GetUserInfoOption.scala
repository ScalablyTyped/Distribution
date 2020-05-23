package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.en
import typings.minappEnv.minappEnvStrings.zh_CN
import typings.minappEnv.minappEnvStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserInfoOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetUserInfoCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetUserInfoFailCallback] = js.undefined
  /** 显示用户信息的语言
    *
    * 可选值：
    * - 'en': 英文;
    * - 'zh_CN': 简体中文;
    * - 'zh_TW': 繁体中文; */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetUserInfoSuccessCallback] = js.undefined
  /** 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。 */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object GetUserInfoOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    lang: en | zh_CN | zh_TW = null,
    success: /* result */ GetUserInfoSuccessCallbackResult => Unit = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): GetUserInfoOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserInfoOption]
  }
}

