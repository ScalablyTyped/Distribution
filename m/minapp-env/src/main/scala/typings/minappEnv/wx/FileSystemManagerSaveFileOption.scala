package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemManagerSaveFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[FileSystemManagerSaveFileCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[FileSystemManagerSaveFileFailCallback] = js.undefined
  /** 要存储的文件路径 */
  var filePath: js.UndefOr[String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[FileSystemManagerSaveFileSuccessCallback] = js.undefined
  /** 临时存储文件路径 */
  var tempFilePath: String
}

object FileSystemManagerSaveFileOption {
  @scala.inline
  def apply(
    tempFilePath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* result */ SaveFileFailCallbackResult => Unit = null,
    filePath: String = null,
    success: /* result */ FileSystemManagerSaveFileSuccessCallbackResult => Unit = null
  ): FileSystemManagerSaveFileOption = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[FileSystemManagerSaveFileOption]
  }
}

