package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RenameCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RenameFailCallback] = js.undefined
  /** 新文件路径 */
  var newPath: String
  /** 源文件路径，可以是普通文件或目录 */
  var oldPath: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RenameSuccessCallback] = js.undefined
}

object RenameOption {
  @scala.inline
  def apply(
    newPath: String,
    oldPath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* result */ RenameFailCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): RenameOption = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RenameOption]
  }
}

