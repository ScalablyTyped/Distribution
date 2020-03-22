package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[DownloadFileCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[DownloadFileFailCallback] = js.undefined
  /** 指定文件下载后存储的路径
    *
    * 最低基础库： `1.8.0` */
  var filePath: js.UndefOr[String] = js.undefined
  /** HTTP 请求的 Header，Header 中不能设置 Referer */
  var header: js.UndefOr[js.Object] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[DownloadFileSuccessCallback] = js.undefined
  /** 下载资源的 url */
  var url: String
}

object DownloadFileOption {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    filePath: String = null,
    header: js.Object = null,
    success: /* result */ DownloadFileSuccessCallbackResult => Unit = null
  ): DownloadFileOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[DownloadFileOption]
  }
}

