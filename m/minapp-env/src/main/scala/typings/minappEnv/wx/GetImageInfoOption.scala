package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetImageInfoCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetImageInfoFailCallback] = js.undefined
  /** 图片的路径，可以是相对路径、临时文件路径、存储文件路径、网络图片路径 */
  var src: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetImageInfoSuccessCallback] = js.undefined
}

object GetImageInfoOption {
  @scala.inline
  def apply(
    src: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ GetImageInfoSuccessCallbackResult => Unit = null
  ): GetImageInfoOption = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetImageInfoOption]
  }
}

