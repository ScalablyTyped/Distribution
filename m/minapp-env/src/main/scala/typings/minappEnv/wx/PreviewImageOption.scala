package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PreviewImageCompleteCallback] = js.undefined
  /** 当前显示图片的链接 */
  var current: js.UndefOr[String] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PreviewImageFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PreviewImageSuccessCallback] = js.undefined
  /** 需要预览的图片链接列表。{% version('2.2.3') %} 起支持云文件ID。 */
  var urls: Array[String]
}

object PreviewImageOption {
  @scala.inline
  def apply(
    urls: Array[String],
    complete: /* res */ GeneralCallbackResult => Unit = null,
    current: String = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): PreviewImageOption = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PreviewImageOption]
  }
}

