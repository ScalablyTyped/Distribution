package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.dark
import typings.minappEnv.minappEnvStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBackgroundTextStyleOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetBackgroundTextStyleCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetBackgroundTextStyleFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetBackgroundTextStyleSuccessCallback] = js.undefined
  /** 下拉背景字体、loading 图的样式。
    *
    * 可选值：
    * - 'dark': dark 样式;
    * - 'light': light 样式; */
  var textStyle: dark | light
}

object SetBackgroundTextStyleOption {
  @scala.inline
  def apply(
    textStyle: dark | light,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetBackgroundTextStyleOption = {
    val __obj = js.Dynamic.literal(textStyle = textStyle.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetBackgroundTextStyleOption]
  }
}

