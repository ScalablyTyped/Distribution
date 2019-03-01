package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
}

object PopoverOptions {
  @scala.inline
  def apply(animation: java.lang.String = null): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    __obj.asInstanceOf[PopoverOptions]
  }
}

