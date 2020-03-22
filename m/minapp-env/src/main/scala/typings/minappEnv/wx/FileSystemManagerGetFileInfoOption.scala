package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemManagerGetFileInfoOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[FileSystemManagerGetFileInfoCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[FileSystemManagerGetFileInfoFailCallback] = js.undefined
  /** 要读取的文件路径 */
  var filePath: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[FileSystemManagerGetFileInfoSuccessCallback] = js.undefined
}

object FileSystemManagerGetFileInfoOption {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* result */ GetFileInfoFailCallbackResult => Unit = null,
    success: /* result */ FileSystemManagerGetFileInfoSuccessCallbackResult => Unit = null
  ): FileSystemManagerGetFileInfoOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[FileSystemManagerGetFileInfoOption]
  }
}

