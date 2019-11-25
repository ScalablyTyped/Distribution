package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions extends js.Object {
  /**
    * @description Animation name. Available animations are `"none"` and `"fade"`.
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[String] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(animation: String = null, animationOptions: String = null): ModalOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
}

