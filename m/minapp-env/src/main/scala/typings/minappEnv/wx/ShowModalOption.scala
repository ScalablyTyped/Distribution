package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowModalOption extends js.Object {
  /** 取消按钮的文字颜色，必须是 16 进制格式的颜色字符串 */
  var cancelColor: js.UndefOr[String] = js.undefined
  /** 取消按钮的文字，最多 4 个字符 */
  var cancelText: js.UndefOr[String] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowModalCompleteCallback] = js.undefined
  /** 确认按钮的文字颜色，必须是 16 进制格式的颜色字符串 */
  var confirmColor: js.UndefOr[String] = js.undefined
  /** 确认按钮的文字，最多 4 个字符 */
  var confirmText: js.UndefOr[String] = js.undefined
  /** 提示的内容 */
  var content: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowModalFailCallback] = js.undefined
  /** 是否显示取消按钮 */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowModalSuccessCallback] = js.undefined
  /** 提示的标题 */
  var title: String
}

object ShowModalOption {
  @scala.inline
  def apply(
    content: String,
    title: String,
    cancelColor: String = null,
    cancelText: String = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    confirmColor: String = null,
    confirmText: String = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ ShowModalSuccessCallbackResult => Unit = null
  ): ShowModalOption = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ShowModalOption]
  }
}

