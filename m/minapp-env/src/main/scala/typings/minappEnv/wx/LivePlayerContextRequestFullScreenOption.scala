package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`-90`
import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivePlayerContextRequestFullScreenOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestFullScreenCompleteCallback] = js.undefined
  /** 设置全屏时的方向
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度; */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFullScreenFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestFullScreenSuccessCallback] = js.undefined
}

object LivePlayerContextRequestFullScreenOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    direction: `0` | `90` | `-90` = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): LivePlayerContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LivePlayerContextRequestFullScreenOption]
  }
}

