package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowActionSheetOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowActionSheetCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowActionSheetFailCallback] = js.undefined
  /** 按钮的文字颜色 */
  var itemColor: js.UndefOr[String] = js.undefined
  /** 按钮的文字数组，数组长度最大为 6 */
  var itemList: Array[String]
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowActionSheetSuccessCallback] = js.undefined
}

object ShowActionSheetOption {
  @scala.inline
  def apply(
    itemList: Array[String],
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    itemColor: String = null,
    success: /* result */ ShowActionSheetSuccessCallbackResult => Unit = null
  ): ShowActionSheetOption = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ShowActionSheetOption]
  }
}

