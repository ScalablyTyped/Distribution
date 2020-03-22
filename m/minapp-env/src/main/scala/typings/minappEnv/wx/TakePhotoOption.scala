package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.high
import typings.minappEnv.minappEnvStrings.low
import typings.minappEnv.minappEnvStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakePhotoOption extends js.Object {
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
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    quality: high | normal | low = null,
    success: /* result */ TakePhotoSuccessCallbackResult => Unit = null
  ): TakePhotoOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TakePhotoOption]
  }
}

