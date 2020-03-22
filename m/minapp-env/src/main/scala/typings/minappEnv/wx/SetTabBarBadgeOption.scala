package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarBadgeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetTabBarBadgeCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetTabBarBadgeFailCallback] = js.undefined
  /** tabBar 的哪一项，从左边算起 */
  var index: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetTabBarBadgeSuccessCallback] = js.undefined
  /** 显示的文本，超过 4 个字符则显示成 ... */
  var text: String
}

object SetTabBarBadgeOption {
  @scala.inline
  def apply(
    index: Double,
    text: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetTabBarBadgeOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetTabBarBadgeOption]
  }
}

