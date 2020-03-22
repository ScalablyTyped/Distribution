package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReaddirCompleteCallback] = js.undefined
  /** 要读取的目录路径 */
  var dirPath: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ReaddirFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReaddirSuccessCallback] = js.undefined
}

object ReaddirOption {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* result */ ReaddirFailCallbackResult => Unit = null,
    success: /* result */ ReaddirSuccessCallbackResult => Unit = null
  ): ReaddirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReaddirOption]
  }
}

