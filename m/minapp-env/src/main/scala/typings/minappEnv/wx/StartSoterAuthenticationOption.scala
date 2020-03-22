package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.facial
import typings.minappEnv.minappEnvStrings.fingerPrint
import typings.minappEnv.minappEnvStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSoterAuthenticationOption extends js.Object {
  /** 验证描述，即识别过程中显示在界面上的对话框提示内容 */
  var authContent: js.UndefOr[String] = js.undefined
  /** 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键识别信息，将作为 `resultJSON` 的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。 */
  var challenge: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartSoterAuthenticationCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartSoterAuthenticationFailCallback] = js.undefined
  /** 请求使用的可接受的生物认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var requestAuthModes: Array[fingerPrint | facial | speech]
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartSoterAuthenticationSuccessCallback] = js.undefined
}

object StartSoterAuthenticationOption {
  @scala.inline
  def apply(
    challenge: String,
    requestAuthModes: Array[fingerPrint | facial | speech],
    authContent: String = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ StartSoterAuthenticationSuccessCallbackResult => Unit = null
  ): StartSoterAuthenticationOption = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    if (authContent != null) __obj.updateDynamic("authContent")(authContent.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartSoterAuthenticationOption]
  }
}

