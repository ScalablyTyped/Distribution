package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
}

object PopoverOptions {
  @scala.inline
  def apply(animation: String = null): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverOptions]
  }
}

