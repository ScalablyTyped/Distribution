package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.game
import typings.minappEnv.minappEnvStrings.normal
import typings.minappEnv.minappEnvStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartGyroscopeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartGyroscopeCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartGyroscopeFailCallback] = js.undefined
  /** 监听陀螺仪数据回调函数的执行频率
    *
    * 可选值：
    * - 'game': 适用于更新游戏的回调频率，在 20ms/次 左右;
    * - 'ui': 适用于更新 UI 的回调频率，在 60ms/次 左右;
    * - 'normal': 普通的回调频率，在 200ms/次 左右; */
  var interval: js.UndefOr[game | ui | normal] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartGyroscopeSuccessCallback] = js.undefined
}

object StartGyroscopeOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    interval: game | ui | normal = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): StartGyroscopeOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartGyroscopeOption]
  }
}

