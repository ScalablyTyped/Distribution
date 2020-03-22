package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UploadFileCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UploadFileFailCallback] = js.undefined
  /** 要上传文件资源的路径 */
  var filePath: String
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Object] = js.undefined
  /** HTTP 请求 Header，Header 中不能设置 Referer */
  var header: js.UndefOr[js.Object] = js.undefined
  /** 文件对应的 key，开发者在服务端可以通过这个 key 获取文件的二进制内容 */
  var name: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UploadFileSuccessCallback] = js.undefined
  /** 开发者服务器地址 */
  var url: String
}

object UploadFileOption {
  @scala.inline
  def apply(
    filePath: String,
    name: String,
    url: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    formData: js.Object = null,
    header: js.Object = null,
    success: /* result */ UploadFileSuccessCallbackResult => Unit = null
  ): UploadFileOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadFileOption]
  }
}

