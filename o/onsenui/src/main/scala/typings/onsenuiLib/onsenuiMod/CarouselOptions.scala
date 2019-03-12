package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  var callback: js.UndefOr[js.Function] = js.undefined
}

object CarouselOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    animationOptions: js.Object = null,
    callback: js.Function = null
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[CarouselOptions]
  }
}

