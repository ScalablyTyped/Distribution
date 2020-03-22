package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStorageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetStorageCompleteCallback] = js.undefined
  /** 需要存储的内容。只支持原生类型、Date、及能够通过`JSON.stringify`序列化的对象。 */
  var data: js.Any
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetStorageFailCallback] = js.undefined
  /** 本地缓存中指定的 key */
  var key: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetStorageSuccessCallback] = js.undefined
}

object SetStorageOption {
  @scala.inline
  def apply(
    data: js.Any,
    key: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetStorageOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetStorageOption]
  }
}

