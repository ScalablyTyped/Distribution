package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetStorageCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetStorageFailCallback] = js.undefined
  /** 本地缓存中指定的 key */
  var key: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetStorageSuccessCallback] = js.undefined
}

object GetStorageOption {
  @scala.inline
  def apply(
    key: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ GetStorageSuccessCallbackResult => Unit = null
  ): GetStorageOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageOption]
  }
}

