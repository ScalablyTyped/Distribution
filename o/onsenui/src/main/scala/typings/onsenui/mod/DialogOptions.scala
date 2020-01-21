package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[js.Function] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(animation: String = null, callback: js.Function = null): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

