package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageScrollToOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PageScrollToCompleteCallback] = js.undefined
  /** 滚动动画的时长，单位 ms */
  var duration: js.UndefOr[Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PageScrollToFailCallback] = js.undefined
  /** 滚动到页面的目标位置，单位 px */
  var scrollTop: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PageScrollToSuccessCallback] = js.undefined
}

object PageScrollToOption {
  @scala.inline
  def apply(
    scrollTop: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    duration: Int | Double = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): PageScrollToOption = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PageScrollToOption]
  }
}

