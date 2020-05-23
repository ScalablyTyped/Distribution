package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.loading
import typings.minappEnv.minappEnvStrings.none
import typings.minappEnv.minappEnvStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowToastOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowToastCompleteCallback] = js.undefined
  /** 提示的延迟时间 */
  var duration: js.UndefOr[Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowToastFailCallback] = js.undefined
  /** 图标
    *
    * 可选值：
    * - 'success': 显示成功图标，此时 title 文本最多显示 7 个汉字长度;
    * - 'loading': 显示加载图标，此时 title 文本最多显示 7 个汉字长度;
    * - 'none': 不显示图标，此时 title 文本最多可显示两行，{% version('1.9.0') %}及以上版本支持; */
  var icon: js.UndefOr[success | loading | none] = js.undefined
  /** 自定义图标的本地路径，image 的优先级高于 icon
    *
    * 最低基础库： `1.1.0` */
  var image: js.UndefOr[String] = js.undefined
  /** 是否显示透明蒙层，防止触摸穿透 */
  var mask: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowToastSuccessCallback] = js.undefined
  /** 提示的内容 */
  var title: String
}

object ShowToastOption {
  @scala.inline
  def apply(
    title: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    icon: success | loading | none = null,
    image: String = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): ShowToastOption = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ShowToastOption]
  }
}

