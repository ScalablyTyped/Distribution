package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.doc
import typings.minappEnv.minappEnvStrings.docx
import typings.minappEnv.minappEnvStrings.pdf
import typings.minappEnv.minappEnvStrings.ppt
import typings.minappEnv.minappEnvStrings.pptx
import typings.minappEnv.minappEnvStrings.xls
import typings.minappEnv.minappEnvStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenDocumentCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenDocumentFailCallback] = js.undefined
  /** 文件路径，可通过 downloadFile 获得 */
  var filePath: String
  /** 文件类型，指定文件类型打开文件
    *
    * 可选值：
    * - 'doc': doc 格式;
    * - 'docx': docx 格式;
    * - 'xls': xls 格式;
    * - 'xlsx': xlsx 格式;
    * - 'ppt': ppt 格式;
    * - 'pptx': pptx 格式;
    * - 'pdf': pdf 格式;
    *
    * 最低基础库： `1.4.0` */
  var fileType: js.UndefOr[doc | docx | xls | xlsx | ppt | pptx | pdf] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenDocumentSuccessCallback] = js.undefined
}

object OpenDocumentOption {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    fileType: doc | docx | xls | xlsx | ppt | pptx | pdf = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): OpenDocumentOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenDocumentOption]
  }
}

