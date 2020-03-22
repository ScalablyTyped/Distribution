package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayBGMOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PlayBGMCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PlayBGMFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PlayBGMSuccessCallback] = js.undefined
  /** 加入背景混音的资源地址 */
  var url: String
}

object PlayBGMOption {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): PlayBGMOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PlayBGMOption]
  }
}

