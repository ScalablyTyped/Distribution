package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  var callback: js.UndefOr[js.Function] = js.undefined
}

object CarouselOptions {
  @scala.inline
  def apply(animation: String = null, animationOptions: js.Object = null, callback: js.Function = null): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
}

