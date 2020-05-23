package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[LoginCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[LoginFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[LoginSuccessCallback] = js.undefined
  /** 超时时间，单位ms
    *
    * 最低基础库： `1.9.90` */
  var timeout: js.UndefOr[Double] = js.undefined
}

object LoginOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ LoginSuccessCallbackResult => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): LoginOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginOption]
  }
}

