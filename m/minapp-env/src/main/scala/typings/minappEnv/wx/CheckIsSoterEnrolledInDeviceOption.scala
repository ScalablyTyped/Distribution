package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.facial
import typings.minappEnv.minappEnvStrings.fingerPrint
import typings.minappEnv.minappEnvStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceOption extends js.Object {
  /** 认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var checkAuthMode: Array[fingerPrint | facial | speech]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CheckIsSoterEnrolledInDeviceCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CheckIsSoterEnrolledInDeviceFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CheckIsSoterEnrolledInDeviceSuccessCallback] = js.undefined
}

object CheckIsSoterEnrolledInDeviceOption {
  @scala.inline
  def apply(
    checkAuthMode: Array[fingerPrint | facial | speech],
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ CheckIsSoterEnrolledInDeviceSuccessCallbackResult => Unit = null
  ): CheckIsSoterEnrolledInDeviceOption = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOption]
  }
}

