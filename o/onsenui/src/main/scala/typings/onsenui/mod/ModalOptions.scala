package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOptions extends js.Object {
  /**
    * @description Animation name. Available animations are `"none"` and `"fade"`.
    */
  var animation: js.UndefOr[String] = js.native
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[String] = js.native
}

object ModalOptions {
  @scala.inline
  def apply(): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptions]
  }
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationOptions(value: String): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOptions: Self = this.set("animationOptions", js.undefined)
  }
  
}

