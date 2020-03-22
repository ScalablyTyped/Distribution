package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarItemOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetTabBarItemCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetTabBarItemFailCallback] = js.undefined
  /** 图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px，当 postion 为 top 时，此参数无效，不支持网络图片 */
  var iconPath: js.UndefOr[String] = js.undefined
  /** tabBar 的哪一项，从左边算起 */
  var index: Double
  /** 选中时的图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px ，当 postion 为 top 时，此参数无效 */
  var selectedIconPath: js.UndefOr[String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetTabBarItemSuccessCallback] = js.undefined
  /** tab 上的按钮文字 */
  var text: js.UndefOr[String] = js.undefined
}

object SetTabBarItemOption {
  @scala.inline
  def apply(
    index: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    iconPath: String = null,
    selectedIconPath: String = null,
    success: /* res */ GeneralCallbackResult => Unit = null,
    text: String = null
  ): SetTabBarItemOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (selectedIconPath != null) __obj.updateDynamic("selectedIconPath")(selectedIconPath.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOption]
  }
}

