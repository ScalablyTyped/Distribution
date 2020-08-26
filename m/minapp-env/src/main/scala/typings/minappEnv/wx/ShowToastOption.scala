package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.loading
import typings.minappEnv.minappEnvStrings.none
import typings.minappEnv.minappEnvStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowToastOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowToastCompleteCallback] = js.native
  /** 提示的延迟时间 */
  var duration: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowToastFailCallback] = js.native
  /** 图标
    *
    * 可选值：
    * - 'success': 显示成功图标，此时 title 文本最多显示 7 个汉字长度;
    * - 'loading': 显示加载图标，此时 title 文本最多显示 7 个汉字长度;
    * - 'none': 不显示图标，此时 title 文本最多可显示两行，{% version('1.9.0') %}及以上版本支持; */
  var icon: js.UndefOr[success | loading | none] = js.native
  /** 自定义图标的本地路径，image 的优先级高于 icon
    *
    * 最低基础库： `1.1.0` */
  var image: js.UndefOr[String] = js.native
  /** 是否显示透明蒙层，防止触摸穿透 */
  var mask: js.UndefOr[Boolean] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowToastSuccessCallback] = js.native
  /** 提示的内容 */
  var title: String = js.native
}

object ShowToastOption {
  @scala.inline
  def apply(title: String): ShowToastOption = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowToastOption]
  }
  @scala.inline
  implicit class ShowToastOptionOps[Self <: ShowToastOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setIcon(value: success | loading | none): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

