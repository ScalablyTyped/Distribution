package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayBackgroundAudioOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PlayBackgroundAudioCompleteCallback] = js.undefined
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  /** 音乐链接，目前支持的格式有 m4a, aac, mp3, wav */
  var dataUrl: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PlayBackgroundAudioFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PlayBackgroundAudioSuccessCallback] = js.undefined
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
}

object PlayBackgroundAudioOption {
  @scala.inline
  def apply(
    dataUrl: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    coverImgUrl: String = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null,
    title: String = null
  ): PlayBackgroundAudioOption = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOption]
  }
}

