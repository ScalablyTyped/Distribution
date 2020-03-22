package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StatCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StatFailCallback] = js.undefined
  /** 文件/目录路径 */
  var path: String
  /** 是否递归获取目录下的每个文件的 Stats 信息
    *
    * 最低基础库： `2.3.0` */
  var recursive: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StatSuccessCallback] = js.undefined
}

object StatOption {
  @scala.inline
  def apply(
    path: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* result */ StatFailCallbackResult => Unit = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ StatSuccessCallbackResult => Unit = null
  ): StatOption = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StatOption]
  }
}

