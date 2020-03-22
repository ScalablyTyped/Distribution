package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTabBarBadgeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RemoveTabBarBadgeCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RemoveTabBarBadgeFailCallback] = js.undefined
  /** tabBar 的哪一项，从左边算起 */
  var index: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RemoveTabBarBadgeSuccessCallback] = js.undefined
}

object RemoveTabBarBadgeOption {
  @scala.inline
  def apply(
    index: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): RemoveTabBarBadgeOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RemoveTabBarBadgeOption]
  }
}

